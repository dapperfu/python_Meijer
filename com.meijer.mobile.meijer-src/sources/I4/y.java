package I4;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"UnknownNullness"})
    public View f14326b;

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f14325a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<AbstractC3830k> f14327c = new ArrayList<>();

    @Deprecated
    public y() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f14326b == yVar.f14326b && this.f14325a.equals(yVar.f14325a);
    }

    public int hashCode() {
        return (this.f14326b.hashCode() * 31) + this.f14325a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f14326b + "\n") + "    values:";
        for (String str2 : this.f14325a.keySet()) {
            str = str + "    " + str2 + ": " + this.f14325a.get(str2) + "\n";
        }
        return str;
    }

    public y(View view) {
        this.f14326b = view;
    }
}
