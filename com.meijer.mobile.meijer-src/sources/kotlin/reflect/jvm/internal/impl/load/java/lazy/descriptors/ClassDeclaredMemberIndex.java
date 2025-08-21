package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLoadingKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {

    /* renamed from: a, reason: collision with root package name */
    private final JavaClass f145346a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1<JavaMember, Boolean> f145347b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1<JavaMethod, Boolean> f145348c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Name, List<JavaMethod>> f145349d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<Name, JavaField> f145350e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Name, JavaRecordComponent> f145351f;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassDeclaredMemberIndex(JavaClass jClass, Function1<? super JavaMember, Boolean> memberFilter) {
        Intrinsics.j(jClass, "jClass");
        Intrinsics.j(memberFilter, "memberFilter");
        this.f145346a = jClass;
        this.f145347b = memberFilter;
        C15339a c15339a = new C15339a(this);
        this.f145348c = c15339a;
        Sequence sequenceB = SequencesKt.B(CollectionsKt.f0(jClass.C()), c15339a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceB) {
            Name name = ((JavaMethod) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f145349d = linkedHashMap;
        Sequence sequenceB2 = SequencesKt.B(CollectionsKt.f0(this.f145346a.y()), this.f145347b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : sequenceB2) {
            linkedHashMap2.put(((JavaField) obj2).getName(), obj2);
        }
        this.f145350e = linkedHashMap2;
        Collection<JavaRecordComponent> collectionM = this.f145346a.m();
        Function1<JavaMember, Boolean> function1 = this.f145347b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionM) {
            if (((Boolean) function1.invoke(obj3)).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((JavaRecordComponent) obj4).getName(), obj4);
        }
        this.f145351f = linkedHashMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(ClassDeclaredMemberIndex classDeclaredMemberIndex, JavaMethod m10) {
        Intrinsics.j(m10, "m");
        return classDeclaredMemberIndex.f145347b.invoke(m10).booleanValue() && !JavaLoadingKt.c(m10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Set<Name> a() {
        Sequence sequenceB = SequencesKt.B(CollectionsKt.f0(this.f145346a.C()), this.f145348c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = sequenceB.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((JavaMethod) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Set<Name> b() {
        return this.f145351f.keySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Set<Name> c() {
        Sequence sequenceB = SequencesKt.B(CollectionsKt.f0(this.f145346a.y()), this.f145347b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = sequenceB.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((JavaField) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Collection<JavaMethod> d(Name name) {
        Intrinsics.j(name, "name");
        List<JavaMethod> list = this.f145349d.get(name);
        return list != null ? list : CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public JavaRecordComponent e(Name name) {
        Intrinsics.j(name, "name");
        return this.f145351f.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public JavaField f(Name name) {
        Intrinsics.j(name, "name");
        return this.f145350e.get(name);
    }
}
