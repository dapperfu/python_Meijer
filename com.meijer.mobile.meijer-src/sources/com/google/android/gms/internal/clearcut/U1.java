package com.google.android.gms.internal.clearcut;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public final class U1 {
    public static <T extends S1> String a(T t10) throws SecurityException, IllegalArgumentException {
        if (t10 == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            b(null, t10, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            return strValueOf.length() != 0 ? "Error printing proto: ".concat(strValueOf) : new String("Error printing proto: ");
        } catch (InvocationTargetException e11) {
            String strValueOf2 = String.valueOf(e11.getMessage());
            return strValueOf2.length() != 0 ? "Error printing proto: ".concat(strValueOf2) : new String("Error printing proto: ");
        }
    }

    private static void b(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (obj != null) {
            int i10 = 0;
            if (!(obj instanceof S1)) {
                String strC = c(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(strC);
                stringBuffer2.append(": ");
                if (obj instanceof String) {
                    String strConcat = (String) obj;
                    if (!strConcat.startsWith("http") && strConcat.length() > 200) {
                        strConcat = String.valueOf(strConcat.substring(0, HttpResponseStatus.SUCCESS_OK)).concat("[...]");
                    }
                    int length = strConcat.length();
                    StringBuilder sb2 = new StringBuilder(length);
                    while (i10 < length) {
                        char cCharAt = strConcat.charAt(i10);
                        if (cCharAt < ' ' || cCharAt > '~' || cCharAt == '\"' || cCharAt == '\'') {
                            sb2.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                        } else {
                            sb2.append(cCharAt);
                        }
                        i10++;
                    }
                    String string = sb2.toString();
                    stringBuffer2.append("\"");
                    stringBuffer2.append(string);
                    stringBuffer2.append("\"");
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    stringBuffer2.append('\"');
                    while (i10 < bArr.length) {
                        int i11 = bArr[i10] & 255;
                        if (i11 == 92 || i11 == 34) {
                            stringBuffer2.append('\\');
                        } else {
                            if (i11 < 32 || i11 >= 127) {
                                stringBuffer2.append(String.format("\\%03o", Integer.valueOf(i11)));
                            }
                            i10++;
                        }
                        stringBuffer2.append((char) i11);
                        i10++;
                    }
                    stringBuffer2.append('\"');
                } else {
                    stringBuffer2.append(obj);
                }
                stringBuffer2.append("\n");
                return;
            }
            int length2 = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(c(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            Class<?> cls = obj.getClass();
            for (Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    Class<?> type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                        b(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length3 = obj2 == null ? 0 : Array.getLength(obj2);
                        for (int i12 = 0; i12 < length3; i12++) {
                            b(name, Array.get(obj2, i12), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            Method[] methods = cls.getMethods();
            int length4 = methods.length;
            while (i10 < length4) {
                String name2 = methods[i10].getName();
                if (name2.startsWith("set")) {
                    String strSubstring = name2.substring(3);
                    try {
                        String strValueOf = String.valueOf(strSubstring);
                        if (((Boolean) cls.getMethod(strValueOf.length() != 0 ? "has".concat(strValueOf) : new String("has"), null).invoke(obj, null)).booleanValue()) {
                            String strValueOf2 = String.valueOf(strSubstring);
                            b(strSubstring, cls.getMethod(strValueOf2.length() != 0 ? "get".concat(strValueOf2) : new String("get"), null).invoke(obj, null), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
                i10++;
            }
            if (str != null) {
                stringBuffer.setLength(length2);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
            }
        }
    }

    private static String c(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (i10 == 0) {
                cCharAt = Character.toLowerCase(cCharAt);
            } else if (Character.isUpperCase(cCharAt)) {
                stringBuffer.append('_');
                cCharAt = Character.toLowerCase(cCharAt);
            }
            stringBuffer.append(cCharAt);
        }
        return stringBuffer.toString();
    }
}
