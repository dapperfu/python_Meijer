#!/usr/bin/env python3

# Use a barcode scanner to inventory items in a pantry/fridge.

import datetime

datetime_object = datetime.datetime.now()

inventory_file = datetime_object.strftime("%Y.%b.%d.inventory.txt")

from meijer import Meijer
# m = Meijer("<mperks-email>|<mperks-password>") # Password, not PIN.
# If no meijer_api_key is specified the class looks at the ```MEIJER_API_KEY``` environmental variable. 
m = Meijer()

while True:
    try:
        try:
            data = input(": ")
            results = m.get_upc(upc=data[1:-1])
            print(f"\t{results['upcs'][0]['shortName']}")
        except:
            pass

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