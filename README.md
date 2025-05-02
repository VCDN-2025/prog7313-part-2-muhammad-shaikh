
#  BudgetBuddy

**BudgetBuddy** is an offline Android app built in Kotlin that helps users track their expenses, set monthly spending goals, and generate category-based reports. Designed for simplicity and offline functionality, it uses RoomDB for data persistence and a user-friendly interface for financial awareness.

---

## Key Features

-  **User Login and Registration**
-  **Add Expense Entries** with:
  - Date
  - Description
  - Amount
  - Category
  - Optional Photo
-  **Create and Manage Categories**
-  **View Expense List** (with date filtering)
-  **Generate Category-Based Reports**
-  **Set Minimum and Maximum Monthly Spending Goals**
-  **Add and View Photographs for Each Entry**
-  **Data Persistence Using RoomDB**
-  **Automated Testing and GitHub Actions Build Integration**

---

##  Built With

- [Kotlin](https://developer.android.com/kotlin)
- [Android Jetpack](https://developer.android.com/jetpack)
  - RoomDB
  - Lifecycle & ViewModel
- [Coroutines](https://developer.android.com/kotlin/coroutines) (`lifecycleScope`)
- [RecyclerView](https://developer.android.com/guide/topics/ui/layout/recyclerview)
- [FileProvider](https://developer.android.com/reference/androidx/core/content/FileProvider)
- GitHub Actions for CI/CD testing

---

## Getting Started

###  Prerequisites

- Android Studio Flamingo
- Emulator or Android device (Android 9+)
- Git installed

###  Installation Steps

git clone https://github.com/VCDN-2025/prog7313-part-2-muhammad-shaikh.git
Open the project in Android Studio.

Let Gradle sync and build the project.

Run the app on an emulator or connected device.

Project Structure

BudgetBuddy/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/budgetbuddy/   # All Kotlin source code
│   │   │   ├── res/                    # Layouts, Drawables, etc.
│   │   │   └── AndroidManifest.xml
│   └── build.gradle.kts
├── build.gradle.kts
└── README.md


APK & Demo
Download APK: https://drive.google.com/file/d/174VRpm0Um4aXEM5fRzh4ZdC1wPq8kzFi/view?usp=sharing

Watch Demo Video: https://youtu.be/s_C_IKXGgl0?si=N_ezeoNsg1D1aC-7

Authors
Muhammad Shaikh - ST10357430
Ubaid Omarjee - ST10315716
Hassan Abdul Razzaq - ST10266113

Bachelor of Computer and Information Sciences (Application Development)

License & Notes
This project was developed for educational purposes as part of a final assignment.
It may be extended for future personal or academic use.
