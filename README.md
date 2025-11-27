Project Title: Android Attendance Eligibility Checker
🌟 Overview
This is a straightforward Android application developed using Kotlin and XML that determines a student's eligibility for final examinations based on their attendance percentage. The application provides instant feedback on whether a student meets the minimum required attendance criteria.

🎯 Key Features
Attendance Calculation: Calculates the precise attendance percentage using the total classes held and the number of classes attended.

Eligibility Check: Compares the calculated percentage against a defined minimum threshold (default criteria is 75%) and displays the eligibility status (Eligible or Ineligible).

Intuitive UI: Built with standard Android XML layouts for a clear and easy-to-use input form.

Profile Image Enhancement: Uses a third-party library to display the student profile picture in a clean circular format.

🛠️ Technology Stack
Primary Language: Kotlin

UI/Layout: Android XML

IDE: Android Studio

This is a straightforward Android application developed using Kotlin and XML that determines a student's eligibility for final examinations based on their attendance percentage. The application provides instant feedback on whether a student meets the minimum required attendance criteria.Calculates the precise attendance percentage using the total classes held and the number of classes attended.

Getting Started-Follow these steps to get the project up and running on your local machine.
1. Cloning the Repository -> Use the following command to clone the project to your computer: git clone https://github.com/Shalvigour/Registration-Form.git
2. Open in Android StudioOpen Android Studio.Select "Open an existing Android Studio project" and navigate to the cloned directory.Allow Gradle to sync the project and download all necessary dependencies.
3. DependenciesEnsure your module-level build.gradle.kts file includes the CircleImageView dependency:Kotlindependencies {
    // ... other dependencies
    implementation("de.hdodenhof:circleimageview:3.1.0") 
}
4. Run the ApplicationRun the application on an emulator or a physical Android device.
