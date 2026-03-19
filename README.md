# 🕐 Digital Clock

A simple desktop digital clock application built with **Java Swing** that displays the current time in real-time with a sleek dark UI.

---

## 📸 Preview

> A minimal window displaying the current time in bold magenta digits on a black background, updated every second.

---

## ✨ Features

- Displays real-time current time in `HH:mm:ss` (24-hour) format
- Updates every second using `javax.swing.Timer`
- Clean, centered UI with bold magenta text on a black background
- Lightweight — no external dependencies

---

## 🛠️ Tech Stack

- **Language:** Java
- **GUI Library:** Java Swing (`JFrame`, `JLabel`)
- **Timer:** `javax.swing.Timer`
- **Date Formatting:** `java.text.SimpleDateFormat`

---

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) **8 or higher**
- A terminal or any Java IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Installation & Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/digital-clock.git
   cd digital-clock
   ```

2. **Compile the source file**
   ```bash
   javac digitalClock.java
   ```

3. **Run the application**
   ```bash
   java digitalClock
   ```

A window (300×150 px) will appear displaying the current time, updating every second.

---

## 📁 Project Structure

```
digital-clock/
│
└── digitalClock.java   # Main application file
```

---

## 🐛 Known Issues / Notes

- The class name `digitalClock` does not follow Java naming conventions. It should ideally be `DigitalClock` (PascalCase) to conform to standard Java style.
- Two consecutive `setBackground()` calls are present — the first (`Color.BLACK`) is overridden by the second (`Color.MAGENTA`). You may want to set the foreground color (`setForeground(Color.MAGENTA)`) and keep the background as `Color.BLACK` for the intended dark theme look:
  ```java
  timeLabel.setBackground(Color.BLACK);
  timeLabel.setForeground(Color.MAGENTA);
  ```

---

## 🔧 Possible Improvements

- [ ] Add AM/PM toggle for 12-hour format
- [ ] Display current date below the time
- [ ] Add alarm functionality
- [ ] Allow the user to customize font size and colors
- [ ] System tray support

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

## 🙌 Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you'd like to change.
