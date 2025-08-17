package Cu;

import kotlin.C6327j;
import kotlin.InterfaceC6326i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR,\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\r\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000e\u0010\u000fRM\u0010\u001b\u001a8\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0006\u0010\u001a¨\u0006\u001c"}, d2 = {"LCu/f;", "", "<init>", "()V", "Lc0/i;", "", "b", "Lc0/i;", "c", "()Lc0/i;", "SpringAnimationSpec", "Lkotlin/Function1;", "LCu/h;", "Lkotlin/jvm/functions/Function1;", "a", "()Lkotlin/jvm/functions/Function1;", "getMaximumFlingDistance$annotations", "MaximumFlingDistance", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "startIndex", "targetIndex", "d", "Lkotlin/jvm/functions/Function3;", "()Lkotlin/jvm/functions/Function3;", "SnapIndex", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f4962a = new f();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final InterfaceC6326i<Float> SpringAnimationSpec = C6327j.j(0.0f, 400.0f, null, 5, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Function1<h, Float> MaximumFlingDistance = a.f4967f;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final Function3<h, Integer, Integer, Integer> SnapIndex = b.f4968f;

    /* renamed from: e, reason: collision with root package name */
    public static final int f4966e = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LCu/h;", "it", "", "a", "(LCu/h;)Ljava/lang/Float;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function1<h, Float> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f4967f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(h it) {
            Intrinsics.j(it, "it");
            return Float.valueOf(Float.MAX_VALUE);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LCu/h;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "targetIndex", "a", "(LCu/h;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function3<h, Integer, Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f4968f = new b();

        b() {
            super(3);
        }

        public final Integer a(h hVar, int i10, int i11) {
            Intrinsics.j(hVar, "<anonymous parameter 0>");
            return Integer.valueOf(i11);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Integer invoke(h hVar, Integer num, Integer num2) {
            return a(hVar, num.intValue(), num2.intValue());
        }
    }

    public final Function1<h, Float> a() {
        return MaximumFlingDistance;
    }

    public final Function3<h, Integer, Integer, Integer> b() {
        return SnapIndex;
    }

    public final InterfaceC6326i<Float> c() {
        return SpringAnimationSpec;
    }

    private f() {
    }
}
