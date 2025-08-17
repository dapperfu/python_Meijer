package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class EnumC5914c {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC5914c f52438a = new EnumC5914c("Paragraph", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC5914c f52439b = new EnumC5914c("Span", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC5914c f52440c = new EnumC5914c("VerbatimTts", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC5914c f52441d = new EnumC5914c("Url", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC5914c f52442e = new EnumC5914c("Link", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC5914c f52443f = new EnumC5914c("Clickable", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC5914c f52444g = new EnumC5914c("String", 6);

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumC5914c[] f52445h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f52446i;

    private static final /* synthetic */ EnumC5914c[] a() {
        return new EnumC5914c[]{f52438a, f52439b, f52440c, f52441d, f52442e, f52443f, f52444g};
    }

    public static EnumC5914c valueOf(String str) {
        return (EnumC5914c) Enum.valueOf(EnumC5914c.class, str);
    }

    public static EnumC5914c[] values() {
        return (EnumC5914c[]) f52445h.clone();
    }

    static {
        EnumC5914c[] enumC5914cArrA = a();
        f52445h = enumC5914cArrA;
        f52446i = EnumEntriesKt.a(enumC5914cArrA);
    }

    private EnumC5914c(String str, int i10) {
    }
}
