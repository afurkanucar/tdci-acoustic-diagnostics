# 🚗 Acoustic Diagnostic Engine (1.4 TDCi Focus)

## 📌 Concept
A unique Android solution for mechanical health monitoring via sound frequency analysis. Designed for engines without extensive sensor arrays (Legacy Euro 4 systems).

## 🛠 Tech Stack & Methodology
- **Signal Processing:** Implements Fast Fourier Transform (FFT) to isolate mechanical noise in the 700Hz-3500Hz range.
- **MVVM Architecture:** Uses LiveData and ViewModel for reactive, lifecycle-aware UI updates.
- **On-Device Analysis:** Asynchronous audio processing using Kotlin Coroutines for zero-latency feedback.

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![ML](https://img.shields.io/badge/Machine_Learning-On--Device-orange?style=for-the-badge)

## 📌 Project Overview
A specialized diagnostic tool for the 1.4 TDCi (Euro 4) engine ecosystem. Since these specific engines often lack comprehensive sensor arrays (like O2/Lambda sensors in early models), this application utilizes on-device microphone sensors to analyze engine "sound signatures" for health monitoring.

## 🚀 Key Technical Features
- **Fast Fourier Transform (FFT) Processing:** Converts raw engine noise into frequency domain data to identify rhythmic mechanical irregularities.
- **On-Device ML Inference:** Uses a lightweight model to classify sound patterns associated with common issues like injector ticking, belt wear, or turbo whistling.
- **Real-time Visualization:** Displays live frequency spectrums using custom Android View components.
- **Asynchronous Data Handling:** Leverages Kotlin Coroutines for non-blocking audio capture and processing.

## 🛠 Engineering Challenge
The primary challenge was filtering out background road noise and wind interference to isolate specific mechanical frequencies (700Hz - 3000Hz) where engine wear typically manifests.
