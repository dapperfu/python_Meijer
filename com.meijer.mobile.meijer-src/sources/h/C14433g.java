package h;

import android.content.Context;
import android.content.Intent;
import h.AbstractC14427a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00172%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0010\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lh/g;", "Lh/a;", "", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lh/a$a;", "e", "(Landroid/content/Context;[Ljava/lang/String;)Lh/a$a;", "", "resultCode", "intent", "f", "(ILandroid/content/Intent;)Ljava/util/Map;", "a", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: h.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14433g extends AbstractC14427a<String[], Map<String, Boolean>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lh/g$a;", "", "<init>", "()V", "", "", "input", "Landroid/content/Intent;", "a", "([Ljava/lang/String;)Landroid/content/Intent;", "ACTION_REQUEST_PERMISSIONS", "Ljava/lang/String;", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: h.g$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent a(String[] input) {
            Intrinsics.j(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            Intrinsics.i(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }
    }

    @Override // h.AbstractC14427a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map<String, Boolean> c(int resultCode, Intent intent) {
        if (resultCode != -1) {
            return MapsKt.k();
        }
        if (intent == null) {
            return MapsKt.k();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return MapsKt.k();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i10 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i10 == 0));
        }
        return MapsKt.y(CollectionsKt.u1(ArraysKt.c0(stringArrayExtra), arrayList));
    }

    @Override // h.AbstractC14427a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] input) {
        Intrinsics.j(context, "context");
        Intrinsics.j(input, "input");
        return INSTANCE.a(input);
    }

    @Override // h.AbstractC14427a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC14427a.C2131a<Map<String, Boolean>> b(Context context, String[] input) {
        Intrinsics.j(context, "context");
        Intrinsics.j(input, "input");
        if (input.length == 0) {
            return new AbstractC14427a.C2131a<>(MapsKt.k());
        }
        for (String str : input) {
            if (Z1.b.a(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(input.length), 16));
        for (String str2 : input) {
            Pair pairA = TuplesKt.a(str2, Boolean.TRUE);
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return new AbstractC14427a.C2131a<>(linkedHashMap);
    }
}
