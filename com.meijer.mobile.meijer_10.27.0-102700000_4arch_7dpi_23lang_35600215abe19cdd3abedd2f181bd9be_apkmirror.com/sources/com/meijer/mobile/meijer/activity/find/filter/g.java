package com.meijer.mobile.meijer.activity.find.filter;

import Qo.l;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import h.AbstractC14314a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/g;", "Lh/a;", "LQo/l$k;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "(Landroid/content/Context;LQo/l$k;)Landroid/content/Intent;", "", "resultCode", "intent", "e", "(ILandroid/content/Intent;)LQo/l$k;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class g extends AbstractC14314a<l.k, l.k> {
    @Override // h.AbstractC14314a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public l.k c(int resultCode, Intent intent) {
        Parcelable parcelable;
        if (resultCode != -1 || intent == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("SEARCH", l.k.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("SEARCH");
            parcelable = (l.k) (parcelableExtra instanceof l.k ? parcelableExtra : null);
        }
        return (l.k) parcelable;
    }

    @Override // h.AbstractC14314a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, l.k input) {
        Intrinsics.j(context, "context");
        Intrinsics.j(input, "input");
        Intent intent = new Intent(context, (Class<?>) FilterActivity.class);
        intent.putExtra("FILTER_AND_SORT_ACTIVITY_LAUNCH_KEY", h.f106708a);
        intent.putExtra("SEARCH", input);
        return intent;
    }
}
