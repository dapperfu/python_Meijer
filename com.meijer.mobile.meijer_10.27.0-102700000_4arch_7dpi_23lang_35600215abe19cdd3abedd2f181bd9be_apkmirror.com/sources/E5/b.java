package E5;

import H1.h;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0004\u0011\u0005\n\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\r\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LE5/b;", "", "<init>", "()V", "LE5/b$b;", "b", "LE5/b$b;", "()LE5/b$b;", "padding", "LE5/b$d;", "c", "LE5/b$d;", "()LE5/b$d;", "spacing", "LE5/b$a;", "d", "LE5/b$a;", "a", "()LE5/b$a;", "button", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final C0125b padding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final d spacing;

    /* renamed from: a, reason: collision with root package name */
    public static final b f7622a = new b();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final a button = new a(new c(32, 40, 48, 56, 64), new c(40, 80, BinsView.TOTE_HEIGHT_DP, 160, HttpResponseStatus.SUCCESS_OK));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LE5/b$a;", "", "LE5/b$c;", "height", "width", "<init>", "(LE5/b$c;LE5/b$c;)V", "a", "LE5/b$c;", "()LE5/b$c;", "b", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final c height;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final c width;

        public a(c height, c width) {
            Intrinsics.j(height, "height");
            Intrinsics.j(width, "width");
            this.height = height;
            this.width = width;
        }

        /* renamed from: a, reason: from getter */
        public final c getHeight() {
            return this.height;
        }

        /* renamed from: b, reason: from getter */
        public final c getWidth() {
            return this.width;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B:\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR \u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\u000eR \u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000b\u0010\u000eR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0011\u0010\u000eR \u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0012\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"LE5/b$b;", "", "LH1/h;", "xSmall", "small", "medium", "large", "xLarge", "xxLarge", "<init>", "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "F", "e", "()F", "b", "c", "d", "f", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: E5.b$b, reason: collision with other inner class name */
    public static final class C0125b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float xSmall;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float small;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float medium;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float large;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float xLarge;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float xxLarge;

        public /* synthetic */ C0125b(float f10, float f11, float f12, float f13, float f14, float f15, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, f11, f12, f13, f14, f15);
        }

        private C0125b(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.xSmall = f10;
            this.small = f11;
            this.medium = f12;
            this.large = f13;
            this.xLarge = f14;
            this.xxLarge = f15;
        }

        /* renamed from: a, reason: from getter */
        public final float getLarge() {
            return this.large;
        }

        /* renamed from: b, reason: from getter */
        public final float getMedium() {
            return this.medium;
        }

        /* renamed from: c, reason: from getter */
        public final float getSmall() {
            return this.small;
        }

        /* renamed from: d, reason: from getter */
        public final float getXLarge() {
            return this.xLarge;
        }

        /* renamed from: e, reason: from getter */
        public final float getXSmall() {
            return this.xSmall;
        }

        /* renamed from: f, reason: from getter */
        public final float getXxLarge() {
            return this.xxLarge;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"LE5/b$c;", "", "", "small", "medium", "large", "xLarge", "xxLarge", "<init>", "(IIIII)V", "a", "I", "c", "()I", "b", "d", "getXLarge", "e", "getXxLarge", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int small;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int medium;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int large;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int xLarge;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int xxLarge;

        /* renamed from: a, reason: from getter */
        public final int getLarge() {
            return this.large;
        }

        /* renamed from: b, reason: from getter */
        public final int getMedium() {
            return this.medium;
        }

        /* renamed from: c, reason: from getter */
        public final int getSmall() {
            return this.small;
        }

        public c(int i10, int i11, int i12, int i13, int i14) {
            this.small = i10;
            this.medium = i11;
            this.large = i12;
            this.xLarge = i13;
            this.xxLarge = i14;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR \u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR \u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"LE5/b$d;", "", "LH1/h;", "small", "medium", "large", "xLarge", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "F", "b", "()F", "c", "getLarge-D9Ej5fM", "d", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float small;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float medium;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float large;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float xLarge;

        public /* synthetic */ d(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, f11, f12, f13);
        }

        private d(float f10, float f11, float f12, float f13) {
            this.small = f10;
            this.medium = f11;
            this.large = f12;
            this.xLarge = f13;
        }

        /* renamed from: a, reason: from getter */
        public final float getMedium() {
            return this.medium;
        }

        /* renamed from: b, reason: from getter */
        public final float getSmall() {
            return this.small;
        }

        /* renamed from: c, reason: from getter */
        public final float getXLarge() {
            return this.xLarge;
        }
    }

    static {
        float f10 = 24;
        float f11 = 32;
        float f12 = 64;
        padding = new C0125b(h.p(4), h.p(8), h.p(16), h.p(f10), h.p(f11), h.p(f12), null);
        spacing = new d(h.p(20), h.p(f10), h.p(f11), h.p(f12), null);
    }

    public final a a() {
        return button;
    }

    public final C0125b b() {
        return padding;
    }

    public final d c() {
        return spacing;
    }

    private b() {
    }
}
