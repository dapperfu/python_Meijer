package Q0;

import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;
import com.fullstory.FS;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"LQ0/G;", "Landroid/view/autofill/AutofillManager$AutofillCallback;", "<init>", "()V", "Landroid/view/View;", "view", "", "virtualId", "event", "", "onAutofillEvent", "(Landroid/view/View;II)V", "LQ0/d;", "autofill", "a", "(LQ0/d;)V", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G extends AutofillManager$AutofillCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final G f27393a = new G();

    private G() {
    }

    public final void a(C4647d autofill) {
        autofill.getAutofillManager().registerCallback(D.a(this));
    }

    public final void b(C4647d autofill) {
        autofill.getAutofillManager().unregisterCallback(D.a(this));
    }

    public void onAutofillEvent(View view, int virtualId, int event) {
        String str;
        super.onAutofillEvent(view, virtualId, event);
        if (event != 1) {
            if (event != 2) {
                if (event != 3) {
                    str = "Unknown status event.";
                } else {
                    str = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
                }
            } else {
                str = "Autofill popup was hidden.";
            }
        } else {
            str = "Autofill popup was shown.";
        }
        FS.log_d("Autofill Status", str);
    }
}
