package kotlin;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a'\u0010\b\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ly1/K;", "a", "()Ly1/K;", "Landroid/graphics/Typeface;", "Ly1/A;", "variationSettings", "Landroid/content/Context;", "context", "c", "(Landroid/graphics/Typeface;Ly1/A;Landroid/content/Context;)Landroid/graphics/Typeface;", "", "name", "Ly1/B;", "fontWeight", "b", "(Ljava/lang/String;Ly1/B;)Ljava/lang/String;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: y1.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18248O {
    public static final InterfaceC18244K a() {
        return Build.VERSION.SDK_INT >= 28 ? new C18246M() : new C18247N();
    }

    public static final Typeface c(Typeface typeface, C18234A c18234a, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? C18253U.f171078a.a(typeface, c18234a, context) : typeface;
    }

    public static final String b(String str, FontWeight fontWeight) {
        int weight = fontWeight.getWeight() / 100;
        if (weight >= 0 && weight < 2) {
            return str + "-thin";
        }
        if (2 <= weight && weight < 4) {
            return str + "-light";
        }
        if (weight == 4) {
            return str;
        }
        if (weight == 5) {
            return str + "-medium";
        }
        if ((6 > weight || weight >= 8) && 8 <= weight && weight < 11) {
            return str + "-black";
        }
        return str;
    }
}
