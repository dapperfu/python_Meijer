package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: androidx.appcompat.widget.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5638n {

    /* renamed from: a, reason: collision with root package name */
    private TextView f46997a;

    /* renamed from: b, reason: collision with root package name */
    private TextClassifier f46998b;

    /* renamed from: androidx.appcompat.widget.n$a */
    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f46998b;
        return textClassifier == null ? a.a(this.f46997a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f46998b = textClassifier;
    }

    C5638n(TextView textView) {
        this.f46997a = (TextView) o2.i.g(textView);
    }
}
