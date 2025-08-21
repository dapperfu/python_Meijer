package Nb;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import eb.C13784a;
import eb.C13785b;
import hb.C14495b;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private static C13784a f20766c = C13785b.a(h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Context f20767a;

    /* renamed from: b, reason: collision with root package name */
    private C14495b f20768b;

    public final String a() {
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        ClipData.Item itemAt;
        CharSequence text;
        try {
            if (!this.f20768b.f135207D.a() || (clipboardManager = (ClipboardManager) this.f20767a.getSystemService("clipboard")) == null || !clipboardManager.hasPrimaryClip() || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() <= 0 || (itemAt = primaryClip.getItemAt(0)) == null || (text = itemAt.getText()) == null) {
                return null;
            }
            return text.toString();
        } catch (RuntimeException e10) {
            e10.getMessage();
        }
        return null;
    }

    public h(C14495b c14495b, Context context) {
        this.f20767a = context;
        this.f20768b = c14495b;
    }
}
