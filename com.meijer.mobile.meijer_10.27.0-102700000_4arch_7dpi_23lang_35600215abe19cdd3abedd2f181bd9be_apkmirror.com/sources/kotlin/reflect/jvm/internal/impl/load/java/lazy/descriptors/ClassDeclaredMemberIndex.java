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
/* loaded from: classes13.dex */
public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {

    /* renamed from: a, reason: collision with root package name */
    private final JavaClass f144439a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1<JavaMember, Boolean> f144440b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1<JavaMethod, Boolean> f144441c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Name, List<JavaMethod>> f144442d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<Name, JavaField> f144443e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Name, JavaRecordComponent> f144444f;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassDeclaredMemberIndex(JavaClass jClass, Function1<? super JavaMember, Boolean> memberFilter) {
        Intrinsics.j(jClass, "jClass");
        Intrinsics.j(memberFilter, "memberFilter");
        this.f144439a = jClass;
        this.f144440b = memberFilter;
        C15236a c15236a = new C15236a(this);
        this.f144441c = c15236a;
        Sequence sequenceB = SequencesKt.B(CollectionsKt.f0(jClass.C()), c15236a);
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
        this.f144442d = linkedHashMap;
        Sequence sequenceB2 = SequencesKt.B(CollectionsKt.f0(this.f144439a.y()), this.f144440b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : sequenceB2) {
            linkedHashMap2.put(((JavaField) obj2).getName(), obj2);
        }
        this.f144443e = linkedHashMap2;
        Collection<JavaRecordComponent> collectionM = this.f144439a.m();
        Function1<JavaMember, Boolean> function1 = this.f144440b;
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
        this.f144444f = linkedHashMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(ClassDeclaredMemberIndex classDeclaredMemberIndex, JavaMethod m10) {
        Intrinsics.j(m10, "m");
        return classDeclaredMemberIndex.f144440b.invoke(m10).booleanValue() && !JavaLoadingKt.c(m10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Set<Name> a() {
        Sequence sequenceB = SequencesKt.B(CollectionsKt.f0(this.f144439a.C()), this.f144441c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = sequenceB.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((JavaMethod) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Set<Name> b() {
        return this.f144444f.keySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Set<Name> c() {
        Sequence sequenceB = SequencesKt.B(CollectionsKt.f0(this.f144439a.y()), this.f144440b);
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
        List<JavaMethod> list = this.f144442d.get(name);
        return list != null ? list : CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public JavaRecordComponent e(Name name) {
        Intrinsics.j(name, "name");
        return this.f144444f.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public JavaField f(Name name) {
        Intrinsics.j(name, "name");
        return this.f144443e.get(name);
    }
}
