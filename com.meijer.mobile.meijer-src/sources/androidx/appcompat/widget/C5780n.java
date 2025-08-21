package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: androidx.appcompat.widget.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5780n {

    /* renamed from: a, reason: collision with root package name */
    private TextView f47221a;

    /* renamed from: b, reason: collision with root package name */
    private TextClassifier f47222b;

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
        TextClassifier textClassifier = this.f47222b;
        return textClassifier == null ? a.a(this.f47221a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f47222b = textClassifier;
    }

    C5780n(TextView textView) {
        this.f47221a = (TextView) o2.i.g(textView);
    }
}
