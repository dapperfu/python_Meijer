package Lb;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import cb.C6380a;
import cb.C6381b;
import fb.C13865b;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private static C6380a f17946c = C6381b.a(h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Context f17947a;

    /* renamed from: b, reason: collision with root package name */
    private C13865b f17948b;

    public final String a() {
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        ClipData.Item itemAt;
        CharSequence text;
        try {
            if (!this.f17948b.f130861D.a() || (clipboardManager = (ClipboardManager) this.f17947a.getSystemService("clipboard")) == null || !clipboardManager.hasPrimaryClip() || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() <= 0 || (itemAt = primaryClip.getItemAt(0)) == null || (text = itemAt.getText()) == null) {
                return null;
            }
            return text.toString();
        } catch (RuntimeException e10) {
            e10.getMessage();
        }
        return null;
    }

    public h(C13865b c13865b, Context context) {
        this.f17947a = context;
        this.f17948b = c13865b;
    }
}
