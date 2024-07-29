# Wallet App UI

This repository contains the source code for a Wallet App UI developed using Jetpack Compose. The app showcases a complex UI implementation, including the use of the compose-charts library by Bytebeats to create graphs and charts.

## Features

- **Modern UI:** Built using Jetpack Compose with Material3 theming.
- **Edge-to-Edge Support:** Utilizes edge-to-edge rendering for a seamless user experience.
- **Card Section:** Displays user's cards.
- **Action Section:** Provides quick actions for the user.
- **Spending Section:** Shows spending categories.
- **Spending Graph:** Visual representation of spending using charts.

## Screenshots
### Light Mode :
<div style="display: flex; justify-content: center; align-items: center;">
    <img src="https://github.com/user-attachments/assets/bcdef33c-c767-487a-a13d-39f45a8f08cc" alt="First Screenshot" style="width: 200px; height: auto; margin-right: 10px;">
    <img src="https://github.com/user-attachments/assets/7ca0bacc-9235-46c3-ab50-c5438cf13afd" alt="Second Screenshot" style="width: 200px; height: auto;">
</div>

### Dark Mode :
<div style="display: flex; justify-content: center; align-items: center;">
    <img src="https://github.com/user-attachments/assets/554fb41e-1055-4682-b8dd-a1723d8af96a" alt="First Screenshot" style="width: 200px; height: auto; margin-right: 10px;">
    <img src="https://github.com/user-attachments/assets/e1fda97e-0644-402c-8e3d-080e1a7848b3" alt="Second Screenshot" style="width: 200px; height: auto;">
</div>

## Getting Started

### Installation

1. Clone the repository:

   ```sh
     git clone https://github.com/Bhavyansh03-tech/Wallet_App_UI.git
   ```
   
2. Open the project in Android Studio.
3. Build the project and run it on an emulator or a physical device.

### Dependencies

The project uses the following dependency for creating charts:
```toml
[versions]
# COMPOSE CHARTS :->
composeCharts = "0.2.1"
# EXTENDED MATERIAL ICONS :->
materialIconsExtended = "1.6.8"
# GOOGLE FONTS :->
uiTextGoogleFonts = "1.6.8"

[libraries]
# COMPOSE CHARTS :->
compose-charts = { module = "io.github.bytebeats:compose-charts", version.ref = "composeCharts" }
# GOOGLE FONTS :->
androidx-ui-text-google-fonts = { module = "androidx.compose.ui:ui-text-google-fonts", version.ref = "uiTextGoogleFonts" }
# EXTENDED MATERIAL ICONS :->
androidx-material-icons-extended = { module = "androidx.compose.material:material-icons-extended", version.ref = "materialIconsExtended" }
```

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any improvements or bug fixes.

1. Fork the repository.
2. Create your feature branch (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -am 'Add some feature'`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Create a new Pull Request.

## Contact

For questions or feedback, please contact [@Bhavyansh03-tech](https://github.com/Bhavyansh03-tech).

---
