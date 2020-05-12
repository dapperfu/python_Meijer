#!/usr/bin/env python3

# Use a barcode scanner to inventory items in a pantry/fridge.

import datetime

datetime_object = datetime.datetime.now()

inventory_file = datetime_object.strftime("%Y.%b.%d.inventory.txt")

while True:
    try:
        data = input(": ")
        with open(inventory_file, "a") as fid:
            now = datetime.datetime.utcnow().isoformat()
            line = f"{now},{data}\n"
            fid.write(line)
        if data in ["+++ATH0", "}}}AYD0"]:
            break
    except KeyboardInterrupt:
        pass
    except EOFError:
        break
    except:
        raise