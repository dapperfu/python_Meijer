package j$.nio.file.attribute;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class w {
    public static final w GROUP_EXECUTE;
    public static final w GROUP_READ;
    public static final w GROUP_WRITE;
    public static final w OTHERS_EXECUTE;
    public static final w OTHERS_READ;
    public static final w OTHERS_WRITE;
    public static final w OWNER_EXECUTE;
    public static final w OWNER_READ;
    public static final w OWNER_WRITE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ w[] f139229a;

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f139229a.clone();
    }

    static {
        w wVar = new w("OWNER_READ", 0);
        OWNER_READ = wVar;
        w wVar2 = new w("OWNER_WRITE", 1);
        OWNER_WRITE = wVar2;
        w wVar3 = new w("OWNER_EXECUTE", 2);
        OWNER_EXECUTE = wVar3;
        w wVar4 = new w("GROUP_READ", 3);
        GROUP_READ = wVar4;
        w wVar5 = new w("GROUP_WRITE", 4);
        GROUP_WRITE = wVar5;
        w wVar6 = new w("GROUP_EXECUTE", 5);
        GROUP_EXECUTE = wVar6;
        w wVar7 = new w("OTHERS_READ", 6);
        OTHERS_READ = wVar7;
        w wVar8 = new w("OTHERS_WRITE", 7);
        OTHERS_WRITE = wVar8;
        w wVar9 = new w("OTHERS_EXECUTE", 8);
        OTHERS_EXECUTE = wVar9;
        f139229a = new w[]{wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8, wVar9};
    }
}
