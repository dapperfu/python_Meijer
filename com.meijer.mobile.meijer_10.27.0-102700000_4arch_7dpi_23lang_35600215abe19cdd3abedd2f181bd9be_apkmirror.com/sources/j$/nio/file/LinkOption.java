package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LinkOption implements t, CopyOption {
    public static final LinkOption NOFOLLOW_LINKS;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LinkOption[] f138613a;

    public static LinkOption valueOf(String str) {
        return (LinkOption) Enum.valueOf(LinkOption.class, str);
    }

    public static LinkOption[] values() {
        return (LinkOption[]) f138613a.clone();
    }

    static {
        LinkOption linkOption = new LinkOption("NOFOLLOW_LINKS", 0);
        NOFOLLOW_LINKS = linkOption;
        f138613a = new LinkOption[]{linkOption};
    }
}
