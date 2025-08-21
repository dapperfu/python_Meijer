package com.scandit.datacapture.core.internal.sdk.init;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/init/LoadMethod;", "", "BY_SO_NAME", "FROM_LOCAL_LIB_FOLDER", "FROM_APK_EXTRACTION", "FROM_DIRECT_ARM64_LIB_FOLDER", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class LoadMethod {
    public static final LoadMethod BY_SO_NAME;
    public static final LoadMethod FROM_APK_EXTRACTION;
    public static final LoadMethod FROM_DIRECT_ARM64_LIB_FOLDER;
    public static final LoadMethod FROM_LOCAL_LIB_FOLDER;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ LoadMethod[] f126450a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f126451b;

    public static EnumEntries<LoadMethod> getEntries() {
        return f126451b;
    }

    public static LoadMethod valueOf(String str) {
        return (LoadMethod) Enum.valueOf(LoadMethod.class, str);
    }

    public static LoadMethod[] values() {
        return (LoadMethod[]) f126450a.clone();
    }

    static {
        LoadMethod loadMethod = new LoadMethod("BY_SO_NAME", 0);
        BY_SO_NAME = loadMethod;
        LoadMethod loadMethod2 = new LoadMethod("FROM_LOCAL_LIB_FOLDER", 1);
        FROM_LOCAL_LIB_FOLDER = loadMethod2;
        LoadMethod loadMethod3 = new LoadMethod("FROM_APK_EXTRACTION", 2);
        FROM_APK_EXTRACTION = loadMethod3;
        LoadMethod loadMethod4 = new LoadMethod("FROM_DIRECT_ARM64_LIB_FOLDER", 3);
        FROM_DIRECT_ARM64_LIB_FOLDER = loadMethod4;
        LoadMethod[] loadMethodArr = {loadMethod, loadMethod2, loadMethod3, loadMethod4};
        f126450a = loadMethodArr;
        f126451b = EnumEntriesKt.a(loadMethodArr);
    }

    private LoadMethod(String str, int i10) {
    }
}
