package a6;

import com.google.android.gms.common.api.a;
import com.radiusnetworks.flybuy.sdk.data.pickup_config.PickupConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u00002\u00020\u0001:\u0004\u001d!%\u001fB©\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0016\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b'\u0010$R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b,\u00104R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b'\u00103\u001a\u0004\b*\u00104R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b+\u00105\u001a\u0004\b%\u00106R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b&\u00105\u001a\u0004\b(\u00106R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b7\u00109R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00168\u0006¢\u0006\f\n\u0004\b.\u0010:\u001a\u0004\b\u001d\u0010;R#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u00168\u0006¢\u0006\f\n\u0004\b)\u0010:\u001a\u0004\b2\u0010;R\u0017\u0010\u001a\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b#\u00108\u001a\u0004\b0\u00109¨\u0006<"}, d2 = {"La6/f;", "", "", "content", "", "width", "maxWidth", "height", "verticalInset", "horizontalInset", "La6/f$b;", "verticalAlignment", "horizontalAlignment", "La6/f$c;", "displayAnimation", "dismissAnimation", "backdropColor", "", "backdropOpacity", "cornerRadius", "", "shouldTakeOverUi", "", "assetMap", "La6/f$d;", "gestureMap", "fitToContent", "<init>", "(Ljava/lang/String;IIIIILa6/f$b;La6/f$b;La6/f$c;La6/f$c;Ljava/lang/String;FFZLjava/util/Map;Ljava/util/Map;Z)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "I", "q", "()I", "c", "m", "j", "e", "p", "f", "l", "g", "La6/f$b;", "o", "()La6/f$b;", "h", "k", "i", "La6/f$c;", "()La6/f$c;", "F", "()F", "n", "Z", "()Z", "Ljava/util/Map;", "()Ljava/util/Map;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String content;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int maxWidth;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int height;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int verticalInset;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int horizontalInset;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b verticalAlignment;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final b horizontalAlignment;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final c displayAnimation;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final c dismissAnimation;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final String backdropColor;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final float backdropOpacity;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final float cornerRadius;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldTakeOverUi;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> assetMap;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Map<d, String> gestureMap;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final boolean fitToContent;

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u0007J\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\u00002\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040$¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010+R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u0016\u0010-\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010,R\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010,R\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0016\u0010/\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010,R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00100R\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00100R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00101R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010+R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00102R\u0016\u00104\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010<\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0004078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R\u0016\u0010>\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00106¨\u0006@"}, d2 = {"La6/f$a;", "", "<init>", "()V", "", "content", "e", "(Ljava/lang/String;)La6/f$a;", "", "width", "l", "(I)La6/f$a;", "height", "h", "La6/f$b;", "verticalAlignment", "k", "(La6/f$b;)La6/f$a;", "horizontalAlignment", "i", "La6/f$c;", "displayAnimation", "g", "(La6/f$c;)La6/f$a;", "dismissAnimation", "f", "backgroundColor", "c", "", "backdropOpacity", "b", "(F)La6/f$a;", "", "shouldTakeOverUi", "j", "(Z)La6/f$a;", "", "assetMap", "a", "(Ljava/util/Map;)La6/f$a;", "La6/f;", "d", "()La6/f;", "Ljava/lang/String;", "I", "maxWidth", "verticalInset", "horizontalInset", "La6/f$b;", "La6/f$c;", "F", "m", "cornerRadius", "n", "Z", "", "o", "Ljava/util/Map;", "La6/f$d;", "p", "gestures", "q", "fitToContent", "r", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    public static final class a {

        /* renamed from: r, reason: collision with root package name */
        private static final C0941a f44374r = new C0941a(null);

        /* renamed from: s, reason: collision with root package name */
        public static final int f44375s = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String content = "";

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int width = 100;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int maxWidth = a.e.API_PRIORITY_OTHER;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int height = 100;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int verticalInset;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int horizontalInset;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private b verticalAlignment;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private b horizontalAlignment;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private c displayAnimation;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private c dismissAnimation;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private String backgroundColor;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private float backdropOpacity;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private float cornerRadius;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private boolean shouldTakeOverUi;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private Map<String, String> assetMap;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private Map<d, String> gestures;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private boolean fitToContent;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"La6/f$a$a;", "", "<init>", "()V", "", "toClip", "", "allowNegative", "a", "(IZ)I", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: a6.f$a$a, reason: collision with other inner class name */
        private static final class C0941a {
            public /* synthetic */ C0941a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0941a() {
            }

            public static /* synthetic */ int b(C0941a c0941a, int i10, boolean z10, int i11, Object obj) {
                if ((i11 & 2) != 0) {
                    z10 = false;
                }
                return c0941a.a(i10, z10);
            }

            public final int a(int toClip, boolean allowNegative) {
                if (!allowNegative && toClip <= 0) {
                    return 0;
                }
                if (toClip <= -100) {
                    return -100;
                }
                if (toClip >= 100) {
                    return 100;
                }
                return toClip;
            }
        }

        public final a a(Map<String, String> assetMap) {
            Intrinsics.j(assetMap, "assetMap");
            this.assetMap = MapsKt.D(assetMap);
            return this;
        }

        public final a b(float backdropOpacity) {
            this.backdropOpacity = backdropOpacity;
            return this;
        }

        public final a c(String backgroundColor) {
            Intrinsics.j(backgroundColor, "backgroundColor");
            this.backgroundColor = backgroundColor;
            return this;
        }

        public final f d() {
            return new f(this.content, this.width, this.maxWidth, this.height, this.verticalInset, this.horizontalInset, this.verticalAlignment, this.horizontalAlignment, this.displayAnimation, this.dismissAnimation, this.backgroundColor, this.backdropOpacity, this.cornerRadius, this.shouldTakeOverUi, this.assetMap, this.gestures, this.fitToContent, null);
        }

        public final a e(String content) {
            Intrinsics.j(content, "content");
            this.content = content;
            return this;
        }

        public final a f(c dismissAnimation) {
            Intrinsics.j(dismissAnimation, "dismissAnimation");
            this.dismissAnimation = dismissAnimation;
            return this;
        }

        public final a g(c displayAnimation) {
            Intrinsics.j(displayAnimation, "displayAnimation");
            this.displayAnimation = displayAnimation;
            return this;
        }

        public final a h(int height) {
            this.height = C0941a.b(f44374r, height, false, 2, null);
            return this;
        }

        public final a i(b horizontalAlignment) {
            Intrinsics.j(horizontalAlignment, "horizontalAlignment");
            this.horizontalAlignment = horizontalAlignment;
            return this;
        }

        public final a j(boolean shouldTakeOverUi) {
            this.shouldTakeOverUi = shouldTakeOverUi;
            return this;
        }

        public final a k(b verticalAlignment) {
            Intrinsics.j(verticalAlignment, "verticalAlignment");
            this.verticalAlignment = verticalAlignment;
            return this;
        }

        public final a l(int width) {
            this.width = C0941a.b(f44374r, width, false, 2, null);
            return this;
        }

        public a() {
            b bVar = b.CENTER;
            this.verticalAlignment = bVar;
            this.horizontalAlignment = bVar;
            c cVar = c.NONE;
            this.displayAnimation = cVar;
            this.dismissAnimation = cVar;
            this.backgroundColor = PickupConfig.DEFAULT_ACCENT_COLOR;
            this.assetMap = new LinkedHashMap();
            this.gestures = new LinkedHashMap();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"La6/f$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum b {
        CENTER,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"La6/f$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum c {
        NONE,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        CENTER,
        FADE
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"La6/f$d;", "", "", "gestureName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "d", "e", "f", "g", "h", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    public enum d {
        SWIPE_UP("swipeUp"),
        SWIPE_DOWN("swipeDown"),
        SWIPE_LEFT("swipeLeft"),
        SWIPE_RIGHT("swipeRight"),
        TAP_BACKGROUND("tapBackground");


        /* renamed from: c, reason: collision with root package name */
        private static final Map<String, d> f44408c;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String gestureName;

        static {
            d[] dVarArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(dVarArrValues.length), 16));
            for (d dVar : dVarArrValues) {
                linkedHashMap.put(dVar.gestureName, dVar);
            }
            f44408c = linkedHashMap;
        }

        d(String str) {
            this.gestureName = str;
        }
    }

    public /* synthetic */ f(String str, int i10, int i11, int i12, int i13, int i14, b bVar, b bVar2, c cVar, c cVar2, String str2, float f10, float f11, boolean z10, Map map, Map map2, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, i11, i12, i13, i14, bVar, bVar2, cVar, cVar2, str2, f10, f11, z10, map, map2, z11);
    }

    private f(String str, int i10, int i11, int i12, int i13, int i14, b bVar, b bVar2, c cVar, c cVar2, String str2, float f10, float f11, boolean z10, Map<String, String> map, Map<d, String> map2, boolean z11) {
        this.content = str;
        this.width = i10;
        this.maxWidth = i11;
        this.height = i12;
        this.verticalInset = i13;
        this.horizontalInset = i14;
        this.verticalAlignment = bVar;
        this.horizontalAlignment = bVar2;
        this.displayAnimation = cVar;
        this.dismissAnimation = cVar2;
        this.backdropColor = str2;
        this.backdropOpacity = f10;
        this.cornerRadius = f11;
        this.shouldTakeOverUi = z10;
        this.assetMap = map;
        this.gestureMap = map2;
        this.fitToContent = z11;
    }

    public final Map<String, String> a() {
        return this.assetMap;
    }

    /* renamed from: b, reason: from getter */
    public final String getBackdropColor() {
        return this.backdropColor;
    }

    /* renamed from: c, reason: from getter */
    public final float getBackdropOpacity() {
        return this.backdropOpacity;
    }

    /* renamed from: d, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: e, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: f, reason: from getter */
    public final c getDismissAnimation() {
        return this.dismissAnimation;
    }

    /* renamed from: g, reason: from getter */
    public final c getDisplayAnimation() {
        return this.displayAnimation;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getFitToContent() {
        return this.fitToContent;
    }

    public final Map<d, String> i() {
        return this.gestureMap;
    }

    /* renamed from: j, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: k, reason: from getter */
    public final b getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* renamed from: l, reason: from getter */
    public final int getHorizontalInset() {
        return this.horizontalInset;
    }

    /* renamed from: m, reason: from getter */
    public final int getMaxWidth() {
        return this.maxWidth;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getShouldTakeOverUi() {
        return this.shouldTakeOverUi;
    }

    /* renamed from: o, reason: from getter */
    public final b getVerticalAlignment() {
        return this.verticalAlignment;
    }

    /* renamed from: p, reason: from getter */
    public final int getVerticalInset() {
        return this.verticalInset;
    }

    /* renamed from: q, reason: from getter */
    public final int getWidth() {
        return this.width;
    }
}
