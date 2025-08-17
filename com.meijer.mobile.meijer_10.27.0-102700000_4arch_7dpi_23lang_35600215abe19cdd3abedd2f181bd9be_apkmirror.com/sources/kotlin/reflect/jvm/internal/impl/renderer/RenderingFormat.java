package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public abstract class RenderingFormat {

    /* renamed from: a, reason: collision with root package name */
    public static final RenderingFormat f146092a = new RenderingFormat("PLAIN", 0) { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.b
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        public String b(String string) {
            Intrinsics.j(string, "string");
            return string;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final RenderingFormat f146093b = new RenderingFormat("HTML", 1) { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.a
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        public String b(String string) {
            Intrinsics.j(string, "string");
            return StringsKt.Q(StringsKt.Q(string, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ RenderingFormat[] f146094c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f146095d;

    public /* synthetic */ RenderingFormat(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10);
    }

    private static final /* synthetic */ RenderingFormat[] a() {
        return new RenderingFormat[]{f146092a, f146093b};
    }

    public abstract String b(String str);

    static {
        RenderingFormat[] renderingFormatArrA = a();
        f146094c = renderingFormatArrA;
        f146095d = EnumEntriesKt.a(renderingFormatArrA);
    }

    private RenderingFormat(String str, int i10) {
    }

    public static RenderingFormat valueOf(String str) {
        return (RenderingFormat) Enum.valueOf(RenderingFormat.class, str);
    }

    public static RenderingFormat[] values() {
        return (RenderingFormat[]) f146094c.clone();
    }
}
