package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes14.dex */
public final class ClassMapperLite {

    /* renamed from: a, reason: collision with root package name */
    public static final ClassMapperLite f146552a = new ClassMapperLite();

    /* renamed from: b, reason: collision with root package name */
    private static final String f146553b = CollectionsKt.B0(CollectionsKt.p('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f146554c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listP = CollectionsKt.p("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iC = ProgressionUtilKt.c(0, listP.size() - 1, 2);
        if (iC >= 0) {
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f146553b;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listP.get(i10));
                int i11 = i10 + 1;
                linkedHashMap.put(sb2.toString(), listP.get(i11));
                linkedHashMap.put(str + '/' + ((String) listP.get(i10)) + "Array", '[' + ((String) listP.get(i11)));
                if (i10 == iC) {
                    break;
                } else {
                    i10 += 2;
                }
            }
        }
        linkedHashMap.put(f146553b + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : CollectionsKt.p("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : CollectionsKt.p("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i12 = 0; i12 < 23; i12++) {
            StringBuilder sb3 = new StringBuilder();
            String str4 = f146553b;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i12);
            a(linkedHashMap, "Function" + i12, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i12, str4 + "/reflect/KFunction");
        }
        for (String str5 : CollectionsKt.p("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, str5 + ".Companion", f146553b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f146554c = linkedHashMap;
    }

    private static final void a(Map<String, String> map, String str, String str2) {
        map.put(f146553b + '/' + str, 'L' + str2 + ';');
    }

    @JvmStatic
    public static final String b(String classId) {
        Intrinsics.j(classId, "classId");
        String str = f146554c.get(classId);
        if (str != null) {
            return str;
        }
        return 'L' + StringsKt.P(classId, '.', '$', false, 4, null) + ';';
    }

    private ClassMapperLite() {
    }
}
