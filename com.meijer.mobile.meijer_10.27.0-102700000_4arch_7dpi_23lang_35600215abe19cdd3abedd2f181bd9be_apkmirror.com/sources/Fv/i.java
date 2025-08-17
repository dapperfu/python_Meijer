package Fv;

import Fv.f;
import Hv.C3696f0;
import Hv.InterfaceC3705l;
import Hv.Y;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\"R \u00103\u001a\b\u0012\u0004\u0012\u00020\u00150\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00108\u001a\b\u0012\u0004\u0012\u00020\u0003048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b%\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0003098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010:R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R \u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\t098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010?R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010BR \u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010=R\u001b\u0010I\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010H\u001a\u0004\b5\u0010\"¨\u0006J"}, d2 = {"LFv/i;", "LFv/f;", "LHv/l;", "", "serialName", "LFv/m;", "kind", "", "elementsCount", "", "typeParameters", "LFv/a;", "builder", "<init>", "(Ljava/lang/String;LFv/m;ILjava/util/List;LFv/a;)V", "index", "j", "(I)Ljava/lang/String;", "name", "h", "(Ljava/lang/String;)I", "", "k", "(I)Ljava/util/List;", "l", "(I)LFv/f;", "", "n", "(I)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "m", "b", "LFv/m;", "f", "()LFv/m;", "c", "I", "i", "d", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "annotations", "", "e", "Ljava/util/Set;", "()Ljava/util/Set;", "serialNames", "", "[Ljava/lang/String;", "elementNames", "g", "[LFv/f;", "elementDescriptors", "[Ljava/util/List;", "elementAnnotations", "", "[Z", "elementOptionality", "", "Ljava/util/Map;", "name2Index", "typeParametersDescriptors", "Lkotlin/Lazy;", "_hashCode", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class i implements f, InterfaceC3705l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m kind;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int elementsCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<Annotation> annotations;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Set<String> serialNames;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String[] elementNames;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final f[] elementDescriptors;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<Annotation>[] elementAnnotations;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean[] elementOptionality;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> name2Index;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final f[] typeParametersDescriptors;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy _hashCode;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i)) {
            return false;
        }
        f fVar = (f) other;
        if (!Intrinsics.e(getSerialName(), fVar.getSerialName()) || !Arrays.equals(this.typeParametersDescriptors, ((i) other).typeParametersDescriptors) || getElementsCount() != fVar.getElementsCount()) {
            return false;
        }
        int elementsCount = getElementsCount();
        for (int i10 = 0; i10 < elementsCount; i10++) {
            if (!Intrinsics.e(l(i10).getSerialName(), fVar.l(i10).getSerialName()) || !Intrinsics.e(l(i10).getKind(), fVar.l(i10).getKind())) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return CollectionsKt.B0(RangesKt.x(0, getElementsCount()), ", ", getSerialName() + '(', ")", 0, null, new Function1() { // from class: Fv.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.o(this.f11115a, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    public i(String serialName, m kind, int i10, List<? extends f> typeParameters, a builder) {
        Intrinsics.j(serialName, "serialName");
        Intrinsics.j(kind, "kind");
        Intrinsics.j(typeParameters, "typeParameters");
        Intrinsics.j(builder, "builder");
        this.serialName = serialName;
        this.kind = kind;
        this.elementsCount = i10;
        this.annotations = builder.c();
        this.serialNames = CollectionsKt.h1(builder.f());
        String[] strArr = (String[]) builder.f().toArray(new String[0]);
        this.elementNames = strArr;
        this.elementDescriptors = Y.b(builder.e());
        this.elementAnnotations = (List[]) builder.d().toArray(new List[0]);
        this.elementOptionality = CollectionsKt.d1(builder.g());
        Iterable<IndexedValue> iterableV1 = ArraysKt.v1(strArr);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterableV1, 10));
        for (IndexedValue indexedValue : iterableV1) {
            arrayList.add(TuplesKt.a(indexedValue.d(), Integer.valueOf(indexedValue.c())));
        }
        this.name2Index = MapsKt.y(arrayList);
        this.typeParametersDescriptors = Y.b(typeParameters);
        this._hashCode = LazyKt.b(new Function0() { // from class: Fv.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(i.d(this.f11114a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(i iVar) {
        return C3696f0.a(iVar, iVar.typeParametersDescriptors);
    }

    private final int e() {
        return ((Number) this._hashCode.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence o(i iVar, int i10) {
        return iVar.j(i10) + ": " + iVar.l(i10).getSerialName();
    }

    @Override // Hv.InterfaceC3705l
    public Set<String> a() {
        return this.serialNames;
    }

    @Override // Fv.f
    /* renamed from: f, reason: from getter */
    public m getKind() {
        return this.kind;
    }

    @Override // Fv.f
    public List<Annotation> getAnnotations() {
        return this.annotations;
    }

    @Override // Fv.f
    public int h(String name) {
        Intrinsics.j(name, "name");
        Integer num = this.name2Index.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // Fv.f
    /* renamed from: i, reason: from getter */
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // Fv.f
    public String j(int index) {
        return this.elementNames[index];
    }

    @Override // Fv.f
    public List<Annotation> k(int index) {
        return this.elementAnnotations[index];
    }

    @Override // Fv.f
    public f l(int index) {
        return this.elementDescriptors[index];
    }

    @Override // Fv.f
    /* renamed from: m, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    @Override // Fv.f
    public boolean n(int index) {
        return this.elementOptionality[index];
    }

    @Override // Fv.f
    public boolean g() {
        return f.a.c(this);
    }

    public int hashCode() {
        return e();
    }

    @Override // Fv.f
    /* renamed from: isInline */
    public boolean getIsInline() {
        return f.a.b(this);
    }
}
