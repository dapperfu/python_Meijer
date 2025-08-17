package com.medallia.digital.mobilesdk;

import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes7.dex */
public class e0 {
    private void handleUseCases(Field field) throws IllegalAccessException, SecurityException {
        if (field.get(this) instanceof e0) {
            ((e0) field.get(this)).validateFields();
            return;
        }
        if (field.get(this) instanceof List) {
            for (Object obj : (List) field.get(this)) {
                if (obj instanceof e0) {
                    ((e0) obj).validateFields();
                }
            }
        }
    }

    public void validateFields() throws SecurityException {
        for (Field field : getClass().getDeclaredFields()) {
            try {
                try {
                    field.setAccessible(true);
                    if (field.get(this) == null) {
                        a4.f(field.getName() + " data is missing");
                    } else {
                        handleUseCases(field);
                    }
                } catch (IllegalAccessException e10) {
                    a4.c(e10.getMessage());
                }
                field.setAccessible(false);
            } catch (Throwable th2) {
                field.setAccessible(false);
                throw th2;
            }
        }
    }
}
