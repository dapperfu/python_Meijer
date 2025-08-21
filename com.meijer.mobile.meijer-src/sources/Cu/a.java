package Cu;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Base64;
import com.fullstory.FS;
import j$.net.URLEncoder;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\u001aE\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00040\u0003\"\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\r\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0001*\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0013\u001a\u00020\u0012*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0001*\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0010\u001a\u0011\u0010\u0016\u001a\u00020\u0001*\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0010¨\u0006\u0017"}, d2 = {"Landroid/content/Context;", "", "action", "", "Lkotlin/Pair;", "", "data", "", "c", "(Landroid/content/Context;Ljava/lang/String;[Lkotlin/Pair;)V", "Landroid/content/Intent;", "key", "value", "e", "(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Object;)V", "f", "(Ljava/lang/String;)Ljava/lang/String;", "msg", "", "d", "(Ljava/lang/Object;Ljava/lang/String;)I", "b", "a", "library_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class a {
    public static final String a(String str) {
        Intrinsics.j(str, "<this>");
        byte[] bArrDecode = Base64.decode(str, 3);
        Intrinsics.i(bArrDecode, "decode(this, Base64.NO_WRAP or Base64.NO_PADDING)");
        return new String(bArrDecode, Charsets.UTF_8);
    }

    public static final String b(String str) {
        Intrinsics.j(str, "<this>");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.i(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrEncode = Base64.encode(bytes, 3);
        Intrinsics.i(bArrEncode, "encode(toByteArray(), Ba…RAP or Base64.NO_PADDING)");
        return new String(bArrEncode, charset);
    }

    public static final void c(Context context, String action, Pair<String, ? extends Object>... data) {
        Intrinsics.j(context, "<this>");
        Intrinsics.j(action, "action");
        Intrinsics.j(data, "data");
        Intent intent = new Intent(action);
        int length = data.length;
        int i10 = 0;
        while (i10 < length) {
            Pair<String, ? extends Object> pair = data[i10];
            i10++;
            e(intent, pair.a(), pair.b());
        }
        Z2.a.b(context).d(intent);
    }

    public static final int d(Object obj, String msg) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(msg, "msg");
        return FS.log_e(Reflection.b(obj.getClass()).t(), msg);
    }

    public static final void e(Intent intent, String key, Object value) {
        Intrinsics.j(intent, "<this>");
        Intrinsics.j(key, "key");
        Intrinsics.j(value, "value");
        if (value instanceof Integer) {
            intent.putExtra(key, ((Number) value).intValue());
            return;
        }
        if (value instanceof Long) {
            intent.putExtra(key, ((Number) value).longValue());
            return;
        }
        if (value instanceof Float) {
            intent.putExtra(key, ((Number) value).floatValue());
            return;
        }
        if (value instanceof Double) {
            intent.putExtra(key, ((Number) value).doubleValue());
            return;
        }
        if (value instanceof String) {
            intent.putExtra(key, (String) value);
            return;
        }
        if (value instanceof Parcelable) {
            intent.putExtra(key, (Parcelable) value);
            return;
        }
        if (value instanceof Serializable) {
            intent.putExtra(key, (Serializable) value);
            return;
        }
        new IllegalArgumentException("Cannot handle type " + value.getClass().getSimpleName());
    }

    public static final String f(String str) throws UnsupportedEncodingException {
        Intrinsics.j(str, "<this>");
        String strEncode = URLEncoder.encode(str, "UTF-8");
        Intrinsics.i(strEncode, "encode(this, \"UTF-8\")");
        return StringsKt.Q(strEncode, "+", "%20", false, 4, null);
    }
}
