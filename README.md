# Roman Numeral Converter Project
## Overview
This project provides a Roman Numeral Converter implemented in Java. It includes a command-line version (Project1.java) and a graphical user interface (GUI) version (RomanNumeralGUI.java). The conversion logic is contained in the RomanNumeralConverter.java file.

## Command-Line Version (Project1.java)

1. Project1
- Main class to run the command-line version.
- Creates an instance of 'RomanNumeralGUI' and calls 'createGUI()'.
  
2. RomanNumeralConverter
- Class containing the conversion logic using arrays for Roman numerals and corresponding Arabic values.
- Provides a method ('convertToInteger') to convert Roman numerals to integers.

## Graphical User Interface Version (RomanNumeralGUI.java)
1. RomanNumeralGUI

- GUI version of the Roman Numeral Converter.
- Extends JFrame to create a window with a grid layout.
- Reads input from a file (input.txt) and displays Roman numerals and their corresponding Arabic values in the GUI.

## How to Run
## Command-Line Version
To run the command-line version, execute the 'Project1' class. This will create an instance of 'RomanNumeralGUI' and display the Roman numerals and their Arabic values.

```sh
java Project1
```

## Graphical User Interface Version
To run the GUI version, execute the 'RomanNumeralGUI' class. The GUI will display Roman numerals and their corresponding Arabic values read from the 'input.txt' file.

```sh
java RomanNumeralGUI
```

## Input File (input.txt)
The input file should contain Roman numerals separated by commas. Each line represents a set of Roman numerals to be converted.

Example 'input.txt' content:

```sh
XIV, XX, III
```

This will be converted and displayed in the GUI.

## Dependencies
No external dependencies are required to run the project.
