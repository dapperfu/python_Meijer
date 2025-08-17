package Al;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J]\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LAl/k;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "afterLogout", "autoLogout", "", "code", "subscribeTexts", "subscribeEmails", "", "emailAddress", "Landroid/content/Intent;", "a", "(Landroid/content/Context;ZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Landroid/content/Intent;", "uri", "c", "(Landroid/content/Context;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Landroid/content/Intent;", "e", "(Landroid/content/Context;Z)Landroid/content/Intent;", "featurenavigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f672a = new k();

    @JvmStatic
    @JvmOverloads
    public static final Intent a(Context context, boolean afterLogout, Boolean autoLogout, Integer code, Boolean subscribeTexts, Boolean subscribeEmails, String emailAddress) {
        Intrinsics.j(context, "context");
        Intent intent = new Intent("action.com.meijer.mobile.authentication.okta.login");
        intent.setPackage(context.getPackageName());
        if (afterLogout) {
            intent.setFlags(805339136);
        }
        if (autoLogout != null) {
            intent.putExtra("com.meijer.intent.extra.AUTO_LOGOUT", autoLogout.booleanValue());
        }
        if (code != null) {
            intent.putExtra("com.meijer.intent.extra.DASHBOARD_LINK", code.intValue());
        }
        if (emailAddress != null) {
            intent.putExtra("com.meijer.intent.extra.EMAIL_ADDRESS", emailAddress);
        }
        if (subscribeTexts != null) {
            intent.putExtra("com.meijer.intent.extra.SUBSCRIBE_TEXTS", subscribeTexts.booleanValue());
        }
        if (subscribeEmails != null) {
            intent.putExtra("com.meijer.intent.extra.SUBSCRIBE_EMAILS", subscribeEmails.booleanValue());
        }
        return intent;
    }

    public static /* synthetic */ Intent b(Context context, boolean z10, Boolean bool, Integer num, Boolean bool2, Boolean bool3, String str, int i10, Object obj) {
        String str2;
        Boolean bool4;
        Integer num2;
        Boolean bool5;
        boolean z11;
        Boolean bool6;
        Context context2;
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            bool = null;
        }
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            bool2 = null;
        }
        if ((i10 & 32) != 0) {
            bool3 = null;
        }
        if ((i10 & 64) != 0) {
            str2 = null;
            bool5 = bool2;
            bool4 = bool3;
            bool6 = bool;
            num2 = num;
            context2 = context;
            z11 = z10;
        } else {
            str2 = str;
            bool4 = bool3;
            num2 = num;
            bool5 = bool2;
            z11 = z10;
            bool6 = bool;
            context2 = context;
        }
        return a(context2, z11, bool6, num2, bool5, bool4, str2);
    }

    @JvmStatic
    @JvmOverloads
    public static final Intent c(Context context, boolean afterLogout, Boolean autoLogout, String uri, Boolean subscribeTexts, Boolean subscribeEmails, String emailAddress) {
        Intrinsics.j(context, "context");
        Intent intent = new Intent("action.com.meijer.mobile.authentication.okta.login");
        intent.setPackage(context.getPackageName());
        if (afterLogout) {
            intent.setFlags(805339136);
        }
        if (autoLogout != null) {
            intent.putExtra("com.meijer.intent.extra.AUTO_LOGOUT", autoLogout.booleanValue());
        }
        if (uri != null) {
            intent.putExtra("com.meijer.intent.extra.URI", uri);
        }
        if (emailAddress != null) {
            intent.putExtra("com.meijer.intent.extra.EMAIL_ADDRESS", emailAddress);
        }
        if (subscribeTexts != null) {
            intent.putExtra("com.meijer.intent.extra.SUBSCRIBE_TEXTS", subscribeTexts.booleanValue());
        }
        if (subscribeEmails != null) {
            intent.putExtra("com.meijer.intent.extra.SUBSCRIBE_EMAILS", subscribeEmails.booleanValue());
        }
        return intent;
    }

    public static /* synthetic */ Intent d(Context context, boolean z10, Boolean bool, String str, Boolean bool2, Boolean bool3, String str2, int i10, Object obj) {
        String str3;
        Boolean bool4;
        String str4;
        Boolean bool5;
        boolean z11;
        Boolean bool6;
        Context context2;
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            bool = null;
        }
        if ((i10 & 8) != 0) {
            str = null;
        }
        if ((i10 & 16) != 0) {
            bool2 = null;
        }
        if ((i10 & 32) != 0) {
            bool3 = null;
        }
        if ((i10 & 64) != 0) {
            str3 = null;
            bool5 = bool2;
            bool4 = bool3;
            bool6 = bool;
            str4 = str;
            context2 = context;
            z11 = z10;
        } else {
            str3 = str2;
            bool4 = bool3;
            str4 = str;
            bool5 = bool2;
            z11 = z10;
            bool6 = bool;
            context2 = context;
        }
        return c(context2, z11, bool6, str4, bool5, bool4, str3);
    }

    public static /* synthetic */ Intent f(k kVar, Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return kVar.e(context, z10);
    }

    public final Intent e(Context context, boolean autoLogout) {
        Intrinsics.j(context, "context");
        Intent intentPutExtra = new Intent("action.com.meijer.mobile.authentication.okta.logout").setPackage(context.getPackageName()).putExtra("com.meijer.intent.extra.AUTO_LOGOUT", autoLogout);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    private k() {
    }
}
