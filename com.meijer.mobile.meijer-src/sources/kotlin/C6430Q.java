package kotlin;

import Z.J;
import Z.K;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u000e\u0012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lc0/Q;", "T", "Lc0/B;", "Lc0/Q$b;", "config", "<init>", "(Lc0/Q$b;)V", "Lc0/q;", "V", "Lc0/o0;", "converter", "Lc0/A0;", "f", "(Lc0/o0;)Lc0/A0;", "a", "Lc0/Q$b;", "getConfig", "()Lc0/Q$b;", "b", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: c0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6430Q<T> implements InterfaceC6415B<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b<T> config;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lc0/Q$a;", "T", "Lc0/P;", "value", "Lc0/C;", "easing", "Lc0/t;", "arcMode", "<init>", "(Ljava/lang/Object;Lc0/C;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "I", "d", "setArcMode-Rur9ykg$animation_core_release", "(I)V", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c0.Q$a */
    public static final class a<T> extends AbstractC6429P<T> {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int arcMode;

        public /* synthetic */ a(Object obj, InterfaceC6416C interfaceC6416C, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, interfaceC6416C, i10);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return Intrinsics.e(aVar.b(), b()) && Intrinsics.e(aVar.getEasing(), getEasing()) && C6463t.c(aVar.arcMode, this.arcMode);
        }

        public /* synthetic */ a(Object obj, InterfaceC6416C interfaceC6416C, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i11 & 2) != 0 ? C6418E.d() : interfaceC6416C, (i11 & 4) != 0 ? C6463t.INSTANCE.a() : i10, null);
        }

        /* renamed from: d, reason: from getter */
        public final int getArcMode() {
            return this.arcMode;
        }

        public int hashCode() {
            int iHashCode;
            T tB = b();
            if (tB != null) {
                iHashCode = tB.hashCode();
            } else {
                iHashCode = 0;
            }
            return (((iHashCode * 31) + C6463t.d(this.arcMode)) * 31) + getEasing().hashCode();
        }

        private a(T t10, InterfaceC6416C interfaceC6416C, int i10) {
            super(t10, interfaceC6416C, null);
            this.arcMode = i10;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0096\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc0/Q$b;", "T", "Lc0/S;", "Lc0/Q$a;", "<init>", "()V", "", "timeStamp", "f", "(Ljava/lang/Object;I)Lc0/Q$a;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: c0.Q$b */
    public static final class b<T> extends AbstractC6431S<T, a<T>> {
        public b() {
            super(null);
        }

        public a<T> f(T t10, int i10) {
            a<T> aVar = new a<>(t10, null, 0, 6, null);
            c().r(i10, aVar);
            return aVar;
        }
    }

    @Override // kotlin.InterfaceC6415B, kotlin.InterfaceC6452i
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public <V extends AbstractC6460q> A0<V> a(o0<T, V> converter) {
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i10;
        J j10 = new J(this.config.c().get_size() + 2);
        K k10 = new K(this.config.c().get_size());
        K<a<T>> kC = this.config.c();
        int[] iArr3 = kC.keys;
        Object[] objArr = kC.values;
        long[] jArr3 = kC.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr3[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j11) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr3[i15];
                            a aVar = (a) objArr[i15];
                            j10.k(i16);
                            i10 = i12;
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            k10.r(i16, new VectorizedKeyframeSpecElementInfo(converter.a().invoke(aVar.b()), aVar.getEasing(), aVar.getArcMode(), null));
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            i10 = i12;
                        }
                        j11 >>= i10;
                        i14++;
                        i12 = i10;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        }
        if (!this.config.c().a(0)) {
            j10.j(0, 0);
        }
        if (!this.config.c().a(this.config.getDurationMillis())) {
            j10.k(this.config.getDurationMillis());
        }
        j10.q();
        return new A0<>(j10, k10, this.config.getDurationMillis(), this.config.getDelayMillis(), C6418E.d(), C6463t.INSTANCE.a(), null);
    }

    public C6430Q(b<T> bVar) {
        this.config = bVar;
    }
}
