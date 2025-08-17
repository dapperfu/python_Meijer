package com.adobe.marketing.mobile;

import T5.a;
import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/adobe/marketing/mobile/s;", "LT5/a$a;", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "onActivityResumed", "(Landroid/app/Activity;)V", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class s implements a.InterfaceC0772a {
    @Override // T5.a.InterfaceC0772a
    public void onActivityResumed(Activity activity) {
        Intrinsics.j(activity, "activity");
        B.a(activity);
    }

    @Override // T5.a.InterfaceC0772a
    public void onActivityPaused(Activity activity) {
        a.InterfaceC0772a.C0773a.a(this, activity);
    }
}
