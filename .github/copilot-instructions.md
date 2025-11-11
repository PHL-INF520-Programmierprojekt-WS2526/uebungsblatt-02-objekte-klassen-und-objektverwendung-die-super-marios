### Quick orientation for AI coding agents

This is a small Java/Gradle teaching repository with two exercises (packages):

- `de.phl.programmingproject.petadoption` — Pet Adoption Center (Pet, Adopter, Adoption, Main)
- `de.phl.programmingproject.enrollmentsystem` — Student Enrollment System (Student, Course, Enrollment, Main)

Top-level facts you need immediately:

- Build: use the included Gradle wrapper: `./gradlew test` (CI may call `gradle test --tests <FQN>`).
- Java toolchain: project targets Java 21 (configured in `build.gradle.kts`).
- CI: `.github/workflows/classroom.yml` runs focused tests with `--tests` for autograding — mirror that locally to reproduce failing tasks.

Coding conventions and API patterns (empirical):

- Constructors validate inputs and throw `IllegalArgumentException` for null/invalid values (see `Course`, `Student`, `Pet`, `Adopter`).
- Mutations are explicit and minimal: fields are `final` where possible; internal collections are package-private (e.g. `Course.enrollments`, `Student.enrollments`) and manipulated by `Enrollment`.
- `getInfo()` methods are the canonical, human-readable output format — tests expect printed lines from `Main` to match these values. Prefer `System.out.println(<obj>.getInfo())` when implementing `Main` tasks.
- `Enrollment` links student and course bidirectionally by adding itself to both `student.enrollments` and `course.enrollments` in the constructor — create `Enrollment` objects via `Student.enroll(course)` or `Course.enroll(student)` and then use the returned `Enrollment` to set grade with `setGrade()`.
- `Adoption.adopt()` sets pet state and returns an `Adoption` object; use `new Date()` for adoption timestamps where required.

Where to implement student work (and how tests interact):

- Fill the TODOs in the two `Main` classes:
  - `src/main/java/de/phl/programmingproject/petadoption/Main.java` — create `Pet`, `Adopter`, call `getInfo()`, check `isAdopted()`, call `adopt(...)` and print adoption info.
  - `src/main/java/de/phl/programmingproject/enrollmentsystem/Main.java` — create `Student`, `Course`, enroll via `enroll(...)`, print `getInfo()`, use `Enrollment.setGrade(4.0)` for the grade task, manage `drop(...)` and printing lists.

Testing and debugging tips specific to this repo:

- Run a single autograding-local test that CI uses with the wrapper, e.g.:
  - `./gradlew test --tests de.phl.programmingproject.petadoption.PetAdoptionCenterTest.task_3_correct_information_for_pet_buddy_printed`
- When tests fail, inspect the expected output in the corresponding test file (tests are narrow and assert printed strings). Match formatting precisely (spacing, commas) — prefer delegating to `.getInfo()` where possible.
- Use `./gradlew test --info` for more verbose output.

Integration and cross-file notes an AI should not overlook:

- Many checks rely on object identity/equality: `Student.isEnrolledIn(course)` and `Course.isStudentEnrolled(student)` rely on Enrollment membership; do not attempt to manipulate private sets directly outside intended flows.
- `Enrollment` throws when the student is already enrolled; create enrollments only once per (student, course) pair.

When editing code:

- Keep method signatures and public behavior unchanged. These are used by tests and other classes.
- Follow existing error semantics (throw `IllegalArgumentException` or `IllegalStateException` exactly where present in the repo patterns).

Files to reference while coding (examples):

- `src/main/java/de/phl/programmingproject/petadoption/Pet.java`
- `src/main/java/de/phl/programmingproject/petadoption/Adopter.java`
- `src/main/java/de/phl/programmingproject/petadoption/Adoption.java`
- `src/main/java/de/phl/programmingproject/enrollmentsystem/Student.java`
- `src/main/java/de/phl/programmingproject/enrollmentsystem/Course.java`
- `src/main/java/de/phl/programmingproject/enrollmentsystem/Enrollment.java`
- `.github/workflows/classroom.yml` (shows exact gradle commands CI uses for each task)

If anything is ambiguous, ask for the exact failing test name or paste the test's expected string — tests are small and targeted, so a failing assertion plus the test name is all that's needed to fix formatting/ordering issues.

---
If you'd like, I can (a) implement the `Main` methods to satisfy the tasks, (b) run the local tests, and (c) iterate until all autograding tests pass — tell me which step to take next.
