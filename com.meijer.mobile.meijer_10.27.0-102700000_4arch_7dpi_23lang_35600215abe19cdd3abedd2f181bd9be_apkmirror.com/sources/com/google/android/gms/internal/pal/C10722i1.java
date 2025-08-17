package com.google.android.gms.internal.pal;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.internal.pal.i1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10722i1 {
    static String a(InterfaceC10690g1 interfaceC10690g1, String str) throws SecurityException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        d(interfaceC10690g1, sb2, 0);
        return sb2.toString();
    }

    static final void b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(I1.a(AbstractC10605b0.u((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC10605b0) {
            sb2.append(": \"");
            sb2.append(I1.a((AbstractC10605b0) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof B0) {
            sb2.append(" {");
            d((B0) obj, sb2, i10 + 2);
            sb2.append("\n");
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i13 = i10 + 2;
        b(sb2, i13, "key", entry.getKey());
        b(sb2, i13, "value", entry.getValue());
        sb2.append("\n");
        while (i11 < i10) {
            sb2.append(' ');
            i11++;
        }
        sb2.append("}");
    }

    private static final String c(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    private static void d(InterfaceC10690g1 interfaceC10690g1, StringBuilder sb2, int i10) throws SecurityException {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC10690g1.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strConcat = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1, strSubstring.length() - 4)));
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb2, i10, c(strConcat), B0.g(method2, interfaceC10690g1, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strConcat2 = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1, strSubstring.length() - 3)));
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb2, i10, c(strConcat2), B0.g(method3, interfaceC10690g1, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strSubstring))) != null && (!strSubstring.endsWith("Bytes") || !map.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                String strConcat3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1)));
                Method method4 = (Method) map.get("get".concat(strSubstring));
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objG = B0.g(method4, interfaceC10690g1, new Object[0]);
                    if (method5 == null) {
                        if (objG instanceof Boolean) {
                            if (((Boolean) objG).booleanValue()) {
                                b(sb2, i10, c(strConcat3), objG);
                            }
                        } else if (objG instanceof Integer) {
                            if (((Integer) objG).intValue() != 0) {
                                b(sb2, i10, c(strConcat3), objG);
                            }
                        } else if (objG instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objG).floatValue()) != 0) {
                                b(sb2, i10, c(strConcat3), objG);
                            }
                        } else if (!(objG instanceof Double)) {
                            if (objG instanceof String) {
                                zEquals = objG.equals("");
                            } else if (objG instanceof AbstractC10605b0) {
                                zEquals = objG.equals(AbstractC10605b0.f83055b);
                            } else if (objG instanceof InterfaceC10690g1) {
                                if (objG != ((InterfaceC10690g1) objG).C()) {
                                    b(sb2, i10, c(strConcat3), objG);
                                }
                            } else if (!(objG instanceof Enum) || ((Enum) objG).ordinal() != 0) {
                                b(sb2, i10, c(strConcat3), objG);
                            }
                            if (!zEquals) {
                                b(sb2, i10, c(strConcat3), objG);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objG).doubleValue()) != 0) {
                            b(sb2, i10, c(strConcat3), objG);
                        }
                    } else if (((Boolean) B0.g(method5, interfaceC10690g1, new Object[0])).booleanValue()) {
                        b(sb2, i10, c(strConcat3), objG);
                    }
                }
            }
        }
        if (interfaceC10690g1 instanceof AbstractC10992z0) {
            throw null;
        }
        K1 k12 = ((B0) interfaceC10690g1).zzc;
        if (k12 != null) {
            k12.g(sb2, i10);
        }
    }
}
