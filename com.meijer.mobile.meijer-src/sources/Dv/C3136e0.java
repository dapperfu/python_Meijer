package Dv;

import Bv.f;
import Bv.n;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010(R\u001a\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010&R\u0016\u00102\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0003038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\"\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u000107038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010?R\"\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010AR%\u0010G\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010D\u001a\u0004\bE\u0010FR!\u0010J\u001a\b\u0012\u0004\u0012\u00020\u0001038@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010D\u001a\u0004\bH\u0010IR\u001b\u0010L\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010D\u001a\u0004\bK\u0010&R\u0014\u0010O\u001a\u00020M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010NR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00030S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010T¨\u0006V"}, d2 = {"LDv/e0;", "LBv/f;", "LDv/l;", "", "serialName", "LDv/z;", "generatedSerializer", "", "elementsCount", "<init>", "(Ljava/lang/String;LDv/z;I)V", "", "q", "()Ljava/util/Map;", "name", "", "isOptional", "", "p", "(Ljava/lang/String;Z)V", "index", "l", "(I)LBv/f;", "n", "(I)Z", "", "", "k", "(I)Ljava/util/List;", "j", "(I)Ljava/lang/String;", "h", "(Ljava/lang/String;)I", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "m", "b", "LDv/z;", "c", "I", "i", "d", "added", "", "e", "[Ljava/lang/String;", "names", "", "f", "[Ljava/util/List;", "propertiesAnnotations", "g", "Ljava/util/List;", "classAnnotations", "", "[Z", "elementsOptionality", "Ljava/util/Map;", "indices", "Lzv/b;", "Lkotlin/Lazy;", "s", "()[Lzv/b;", "childSerializers", "t", "()[LBv/f;", "typeParameterDescriptors", "u", "_hashCode", "LBv/m;", "()LBv/m;", "kind", "getAnnotations", "()Ljava/util/List;", "annotations", "", "()Ljava/util/Set;", "serialNames", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* renamed from: Dv.e0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C3136e0 implements Bv.f, InterfaceC3147l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3160z<?> generatedSerializer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int elementsCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int added;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String[] names;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<Annotation>[] propertiesAnnotations;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private List<Annotation> classAnnotations;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean[] elementsOptionality;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Map<String, Integer> indices;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Lazy childSerializers;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy typeParameterDescriptors;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy _hashCode;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3136e0)) {
            return false;
        }
        Bv.f fVar = (Bv.f) other;
        if (!Intrinsics.e(getSerialName(), fVar.getSerialName()) || !Arrays.equals(t(), ((C3136e0) other).t()) || getElementsCount() != fVar.getElementsCount()) {
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
        return CollectionsKt.B0(RangesKt.x(0, this.elementsCount), ", ", getSerialName() + '(', ")", 0, null, new Function1() { // from class: Dv.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3136e0.v(this.f6732a, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    public C3136e0(String serialName, InterfaceC3160z<?> interfaceC3160z, int i10) {
        Intrinsics.j(serialName, "serialName");
        this.serialName = serialName;
        this.generatedSerializer = interfaceC3160z;
        this.elementsCount = i10;
        this.added = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.names = strArr;
        int i12 = this.elementsCount;
        this.propertiesAnnotations = new List[i12];
        this.elementsOptionality = new boolean[i12];
        this.indices = MapsKt.k();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f143287b;
        this.childSerializers = LazyKt.a(lazyThreadSafetyMode, new Function0() { // from class: Dv.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3136e0.r(this.f6733a);
            }
        });
        this.typeParameterDescriptors = LazyKt.a(lazyThreadSafetyMode, new Function0() { // from class: Dv.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3136e0.w(this.f6734a);
            }
        });
        this._hashCode = LazyKt.a(lazyThreadSafetyMode, new Function0() { // from class: Dv.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C3136e0.o(this.f6735a));
            }
        });
    }

    private final Map<String, Integer> q() {
        HashMap map = new HashMap();
        int length = this.names.length;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(this.names[i10], Integer.valueOf(i10));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zv.b[] r(C3136e0 c3136e0) {
        zv.b<?>[] bVarArrE;
        InterfaceC3160z<?> interfaceC3160z = c3136e0.generatedSerializer;
        return (interfaceC3160z == null || (bVarArrE = interfaceC3160z.e()) == null) ? C3140g0.f6752a : bVarArrE;
    }

    private final zv.b<?>[] s() {
        return (zv.b[]) this.childSerializers.getValue();
    }

    private final int u() {
        return ((Number) this._hashCode.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence v(C3136e0 c3136e0, int i10) {
        return c3136e0.j(i10) + ": " + c3136e0.l(i10).getSerialName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bv.f[] w(C3136e0 c3136e0) {
        ArrayList arrayList;
        zv.b<?>[] bVarArrD;
        InterfaceC3160z<?> interfaceC3160z = c3136e0.generatedSerializer;
        if (interfaceC3160z == null || (bVarArrD = interfaceC3160z.d()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(bVarArrD.length);
            for (zv.b<?> bVar : bVarArrD) {
                arrayList.add(bVar.getDescriptor());
            }
        }
        return Y.b(arrayList);
    }

    @Override // Dv.InterfaceC3147l
    public Set<String> a() {
        return this.indices.keySet();
    }

    @Override // Bv.f
    /* renamed from: f */
    public Bv.m getKind() {
        return n.a.f3728a;
    }

    @Override // Bv.f
    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.classAnnotations;
        return list == null ? CollectionsKt.m() : list;
    }

    @Override // Bv.f
    public int h(String name) {
        Intrinsics.j(name, "name");
        Integer num = this.indices.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // Bv.f
    /* renamed from: i, reason: from getter */
    public final int getElementsCount() {
        return this.elementsCount;
    }

    @Override // Bv.f
    public String j(int index) {
        return this.names[index];
    }

    @Override // Bv.f
    public List<Annotation> k(int index) {
        List<Annotation> list = this.propertiesAnnotations[index];
        return list == null ? CollectionsKt.m() : list;
    }

    @Override // Bv.f
    /* renamed from: m, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    @Override // Bv.f
    public boolean n(int index) {
        return this.elementsOptionality[index];
    }

    public final void p(String name, boolean isOptional) {
        Intrinsics.j(name, "name");
        String[] strArr = this.names;
        int i10 = this.added + 1;
        this.added = i10;
        strArr[i10] = name;
        this.elementsOptionality[i10] = isOptional;
        this.propertiesAnnotations[i10] = null;
        if (i10 == this.elementsCount - 1) {
            this.indices = q();
        }
    }

    public final Bv.f[] t() {
        return (Bv.f[]) this.typeParameterDescriptors.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(C3136e0 c3136e0) {
        return C3138f0.a(c3136e0, c3136e0.t());
    }

    @Override // Bv.f
    public boolean g() {
        return f.a.c(this);
    }

    public int hashCode() {
        return u();
    }

    @Override // Bv.f
    /* renamed from: isInline */
    public boolean getIsInline() {
        return f.a.b(this);
    }

    @Override // Bv.f
    public Bv.f l(int index) {
        return s()[index].getDescriptor();
    }
}
