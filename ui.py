import tkinter as tk
from threading import Thread
from farming import nether_wart, mushroom, sugar_cane, cactus, melon_pumpkin, cocoa, pickup_stash

def start_function(func, *args):
    """Run the selected function in a separate thread."""
    thread = Thread(target=func, args=args)
    thread.daemon = True  # Ensure the thread closes when the main program exits
    thread.start()

def main_ui():
    # Create the main window
    root = tk.Tk()
    root.title("Farming Macro Controller")
    root.geometry("400x600")

    # Create buttons for each function
    tk.Label(root, text="Select a Farming Macro", font=("Arial", 16)).pack(pady=10)

    # Mushroom Farming Button
    tk.Button(
        root, text="Mushroom Farming", command=lambda: start_function(mushroom, 60), width=20, height=2
    ).pack(pady=5)

    # Nether Wart Farming Button
    tk.Button(
        root, text="Nether Wart Farming", command=lambda: start_function(nether_wart, 60, 0), width=20, height=2
    ).pack(pady=5)

    # Sugar Cane Farming Button
    tk.Button(
        root, text="Sugar Cane Farming", command=lambda: start_function(sugar_cane), width=20, height=2
    ).pack(pady=5)

    # Cactus Farming Button
    tk.Button(
        root, text="Cactus Farming", command=lambda: start_function(cactus), width=20, height=2
    ).pack(pady=5)

    # Melon and Pumpkin Farming Button
    tk.Button(
        root, text="Melon & Pumpkin Farming", command=lambda: start_function(melon_pumpkin), width=20, height=2
    ).pack(pady=5)

    # Cocoa Farming Button
    tk.Button(
        root, text="Cocoa Farming", command=lambda: start_function(cocoa), width=20, height=2
    ).pack(pady=5)

    # Pickup Stash Button
    tk.Button(
        root, text="Pickup Stash", command=lambda: start_function(pickup_stash), width=20, height=2
    ).pack(pady=5)

    # Run the Tkinter event loop
    root.mainloop()
