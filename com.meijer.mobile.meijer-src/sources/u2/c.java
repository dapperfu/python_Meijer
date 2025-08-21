package u2;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class c extends AbstractC17346a {

    /* renamed from: i, reason: collision with root package name */
    private int f163692i;

    /* renamed from: j, reason: collision with root package name */
    private int f163693j;

    /* renamed from: k, reason: collision with root package name */
    private LayoutInflater f163694k;

    @Override // u2.AbstractC17346a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f163694k.inflate(this.f163693j, viewGroup, false);
    }

    @Override // u2.AbstractC17346a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f163694k.inflate(this.f163692i, viewGroup, false);
    }

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f163693j = i10;
        this.f163692i = i10;
        this.f163694k = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
