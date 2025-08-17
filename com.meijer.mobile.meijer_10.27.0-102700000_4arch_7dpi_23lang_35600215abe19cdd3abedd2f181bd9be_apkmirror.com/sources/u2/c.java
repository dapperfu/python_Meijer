package u2;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class c extends AbstractC17219a {

    /* renamed from: i, reason: collision with root package name */
    private int f162654i;

    /* renamed from: j, reason: collision with root package name */
    private int f162655j;

    /* renamed from: k, reason: collision with root package name */
    private LayoutInflater f162656k;

    @Override // u2.AbstractC17219a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f162656k.inflate(this.f162655j, viewGroup, false);
    }

    @Override // u2.AbstractC17219a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f162656k.inflate(this.f162654i, viewGroup, false);
    }

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f162655j = i10;
        this.f162654i = i10;
        this.f162656k = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
