import pyautogui
import time

def press_key(key, duration):
    """Press a key for a specific duration."""
    pyautogui.keyDown(key)
    time.sleep(duration)
    pyautogui.keyUp(key)

# Mushroom Farming
def mushroom(duration_in_secs):
    print("hi")
    while True:
        # Move right
        press_key('d', duration_in_secs * 2 - 7)
        time.sleep(0.001)

        # Move down
        press_key('s', 3)
        time.sleep(0.001)

        # Move left and up
        press_key('a', 0.5)
        press_key('w', 2)

        # Wait for duration while moving left and up
        time.sleep(duration_in_secs * 2 - 20)
        pyautogui.keyUp('a')
        pyautogui.keyUp('w')
        time.sleep(0.001)

        # Move down
        press_key('s', 3)
        time.sleep(0.001)

        # Move right and up
        press_key('d', 0.5)
        press_key('w', 2)
        pyautogui.keyUp('w')

        # Wait for duration while moving right
        time.sleep(duration_in_secs * 2 - 7)
        pyautogui.keyUp('d')
        time.sleep(0.5)

        # Move down
        press_key('s', 3)
        time.sleep(0.5)

        # Move left and up
        press_key('a', 0.5)
        press_key('w', 2)

        # Wait for duration while moving left and up
        time.sleep(duration_in_secs * 2 - 20)
        pyautogui.keyUp('a')
        pyautogui.keyUp('w')
        time.sleep(0.001)

        # Move up
        press_key('w', 7)
        time.sleep(0.5)

# Nether Wart, Wheat, Carrot, Potatoes
def nether_wart(duration_in_secs, leftover_duration):
    while True:
        # Move right
        press_key('d', duration_in_secs * 2 + leftover_duration)
        time.sleep(0.001)

        # Move down
        press_key('s', 3)
        time.sleep(0.001)

        # Move left and up
        press_key('a', 1)
        press_key('w', 1)

        # Move left for the duration
        press_key('a', duration_in_secs * 2 + leftover_duration)
        time.sleep(0.001)

        # Move down
        press_key('s', 3)
        time.sleep(0.001)

        # Move right and up
        press_key('d', 1)
        press_key('w', 1)

        # Move right for the duration
        press_key('d', duration_in_secs * 2 + leftover_duration)
        time.sleep(0.5)

        # Move down
        press_key('s', 3)
        time.sleep(0.5)

        # Move left and up
        press_key('a', 1)
        press_key('w', 1)

        # Move left for the duration
        press_key('a', duration_in_secs * 2 + leftover_duration)
        time.sleep(0.001)

        # Move up
        press_key('w', 6)
        time.sleep(0.5)

# Sugar Cane
def sugar_cane():
    while True:
        # Press and hold 'A' for 46 seconds
        press_key('a', 46)

        # Press and hold 'S' for 53 seconds
        press_key('s', 53)

        # Repeat 'A' press for 46 seconds
        press_key('a', 46)

        # Repeat 'S' press for 53 seconds
        press_key('s', 53)

        # Repeat 'A' press for 46 seconds
        press_key('a', 46)

        # Repeat 'S' press for 53 seconds
        press_key('s', 53)

        # Press and hold 'D' for 3 seconds
        press_key('d', 3)

# Cactus
def cactus():
    while True:
        # Press 'D' and 'S', then hold 'D' for 24 seconds
        press_key('d', 0.2)
        press_key('s', 0.2)
        press_key('d', 24)

        # Quick press 'S'
        press_key('s', 0.7)

        # Press and hold 'A' for 24 seconds
        press_key('a', 24)

        # Quick press 'S'
        press_key('s', 0.7)

        # Repeat 'D' key for 24 seconds
        press_key('d', 24)

        # Quick press 'S'
        press_key('s', 0.7)

        # Repeat 'A' key for 24 seconds
        press_key('a', 24)

        # Quick press 'S'
        press_key('s', 0.7)

        # Repeat 'D' key for 24 seconds
        press_key('d', 24)

        # Quick press 'S'
        press_key('s', 0.7)

        # Repeat 'A' key for 24 seconds
        press_key('a', 24)

        # Quick press 'S'
        press_key('s', 0.7)

        # Final movement: Press and hold 'W' key
        press_key('w', 5)

        # Pause before the next iteration
        time.sleep(0.5)

# Melon and Pumpkin
def melon_pumpkin():
    while True:
        # Hold 'A' and 'W' keys for 29 seconds
        press_key('a', 29)
        pyautogui.keyDown('w')  # Keep holding 'W'
        time.sleep(0.1)  # 100 ms delay

        # Hold 'D' key for 29 seconds
        press_key('d', 29)

        # Repeat 6 'A' and 5 'D' sequences
        for i in range(6):  # 6 times for 'A'
            press_key('a', 29)
            time.sleep(0.1)  # 100 ms delay
            
            if i < 5:  # Only press 'D' 5 times
                press_key('d', 29)

        # Release 'W' key
        pyautogui.keyUp('w')
        time.sleep(0.1)  # 100 ms delay

        # Press 'S' key for 2.7 seconds
        press_key('s', 2.7)
        time.sleep(0.1)  # 100 ms delay

# Cocoa Beans
def cocoa():
    while True:
        secs = 26.5  # Duration in seconds for the main actions

        # Repeat sequence 12 times as in the Java code
        for i in range(12):
            # Press and hold 'S' key
            press_key('s', secs)
            time.sleep(0.1)  # 100 milliseconds delay

            # Press and hold 'A' key for 400 milliseconds
            press_key('a', 0.4)

            # Press and hold 'W' key
            press_key('w', secs)
            time.sleep(0.1)  # 100 milliseconds delay

            # Press and hold 'A' key for 500 milliseconds
            press_key('a', 0.5)

            # Special case for the 12th iteration
            if i == 11:
                # Add extra 2 seconds to the last 'W' press
                press_key('w', 2)
                time.sleep(0.1)  # 100 milliseconds delay

                # Press and hold 'D' key for 5 seconds
                press_key('d', 5)

# Pickup Stash
def pickup_stash():
    while True:
        # Press and release the 'T' key
        press_key('t', 0.1)

        # Press and release the 'UP' arrow key
        press_key('up', 0.1)

        # Press and release the 'ENTER' key
        press_key('enter', 0.1)

        # 2 seconds delay
        time.sleep(2)





