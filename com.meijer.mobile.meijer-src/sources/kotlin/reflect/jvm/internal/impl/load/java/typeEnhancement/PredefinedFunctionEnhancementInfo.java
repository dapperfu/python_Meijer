package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class PredefinedFunctionEnhancementInfo {

    /* renamed from: a, reason: collision with root package name */
    private final TypeEnhancementInfo f145571a;

    /* renamed from: b, reason: collision with root package name */
    private final List<TypeEnhancementInfo> f145572b;

    /* renamed from: c, reason: collision with root package name */
    private final String f145573c;

    /* renamed from: d, reason: collision with root package name */
    private final PredefinedFunctionEnhancementInfo f145574d;

    public PredefinedFunctionEnhancementInfo() {
        this(null, null, null, 7, null);
    }

    public PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, List<TypeEnhancementInfo> parametersInfo, String str) {
        Intrinsics.j(parametersInfo, "parametersInfo");
        this.f145571a = typeEnhancementInfo;
        this.f145572b = parametersInfo;
        this.f145573c = str;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo = null;
        if (str != null) {
            TypeEnhancementInfo typeEnhancementInfoA = typeEnhancementInfo != null ? typeEnhancementInfo.a() : null;
            List<TypeEnhancementInfo> list = parametersInfo;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            for (TypeEnhancementInfo typeEnhancementInfo2 : list) {
                arrayList.add(typeEnhancementInfo2 != null ? typeEnhancementInfo2.a() : null);
            }
            predefinedFunctionEnhancementInfo = new PredefinedFunctionEnhancementInfo(typeEnhancementInfoA, arrayList, null);
        }
        this.f145574d = predefinedFunctionEnhancementInfo;
    }

    public final String a() {
        return this.f145573c;
    }

    public final List<TypeEnhancementInfo> b() {
        return this.f145572b;
    }

    public final TypeEnhancementInfo c() {
        return this.f145571a;
    }

    public final PredefinedFunctionEnhancementInfo d() {
        return this.f145574d;
    }

    public /* synthetic */ PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : typeEnhancementInfo, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? null : str);
    }
}
