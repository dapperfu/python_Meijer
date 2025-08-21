package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class SignatureBuildingComponents {

    /* renamed from: a, reason: collision with root package name */
    public static final SignatureBuildingComponents f145736a = new SignatureBuildingComponents();

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence l(String it) {
        Intrinsics.j(it, "it");
        return f145736a.c(it);
    }

    public final String[] b(String... signatures) {
        Intrinsics.j(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final Set<String> d(String internalName, String... signatures) {
        Intrinsics.j(internalName, "internalName");
        Intrinsics.j(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    public final Set<String> e(String name, String... signatures) {
        Intrinsics.j(name, "name");
        Intrinsics.j(signatures, "signatures");
        return d(h(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final Set<String> f(String name, String... signatures) {
        Intrinsics.j(name, "name");
        Intrinsics.j(signatures, "signatures");
        return d(i(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final String g(String name) {
        Intrinsics.j(name, "name");
        return "java/util/function/" + name;
    }

    public final String h(String name) {
        Intrinsics.j(name, "name");
        return "java/lang/" + name;
    }

    public final String i(String name) {
        Intrinsics.j(name, "name");
        return "java/util/" + name;
    }

    public final String j(String name) {
        Intrinsics.j(name, "name");
        return "java/util/concurrent/atomic/" + name;
    }

    public final String k(String name, List<String> parameters, String ret) {
        Intrinsics.j(name, "name");
        Intrinsics.j(parameters, "parameters");
        Intrinsics.j(ret, "ret");
        return name + '(' + CollectionsKt.B0(parameters, "", null, null, 0, null, e.f145762a, 30, null) + ')' + c(ret);
    }

    public final String m(String internalName, String jvmDescriptor) {
        Intrinsics.j(internalName, "internalName");
        Intrinsics.j(jvmDescriptor, "jvmDescriptor");
        return internalName + '.' + jvmDescriptor;
    }

    private SignatureBuildingComponents() {
    }

    private final String c(String str) {
        if (str.length() > 1) {
            return 'L' + str + ';';
        }
        return str;
    }
}
