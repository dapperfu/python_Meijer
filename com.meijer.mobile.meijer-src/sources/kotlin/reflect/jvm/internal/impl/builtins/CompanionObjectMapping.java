package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class CompanionObjectMapping {

    /* renamed from: a, reason: collision with root package name */
    public static final CompanionObjectMapping f144143a = new CompanionObjectMapping();

    /* renamed from: b, reason: collision with root package name */
    private static final Set<ClassId> f144144b;

    static {
        Set<PrimitiveType> set = PrimitiveType.f144163f;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(StandardNames.c((PrimitiveType) it.next()));
        }
        List listQ0 = CollectionsKt.Q0(CollectionsKt.Q0(CollectionsKt.Q0(arrayList, StandardNames.FqNames.f144289h.m()), StandardNames.FqNames.f144293j.m()), StandardNames.FqNames.f144311s.m());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ClassId.Companion companion = ClassId.f146581d;
        Iterator it2 = listQ0.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(companion.c((FqName) it2.next()));
        }
        f144144b = linkedHashSet;
    }

    public final Set<ClassId> a() {
        return f144144b;
    }

    public final Set<ClassId> b() {
        return f144144b;
    }

    private CompanionObjectMapping() {
    }
}
