package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import com.google.ads.interactivemedia.omid.library.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class zzcv {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final List zzb = new ArrayList();

    public final List zza() {
        return this.zzb;
    }

    public final void zzb(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        zzcu zzcuVar;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!zza.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
        Iterator it = this.zzb.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzcuVar = null;
                break;
            } else {
                zzcuVar = (zzcu) it.next();
                if (zzcuVar.zzb().get() == view) {
                    break;
                }
            }
        }
        if (zzcuVar == null) {
            this.zzb.add(new zzcu(view, friendlyObstructionPurpose, str));
        }
    }

    public final void zzc() {
        this.zzb.clear();
    }
}
