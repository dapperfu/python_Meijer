package com.google.android.libraries.places.api.model;

import De.p;
import Ee.L;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class AddressComponent implements Parcelable {
    @RecentlyNonNull
    public abstract String getName();

    @RecentlyNullable
    public abstract String getShortName();

    @RecentlyNonNull
    public abstract List<String> getTypes();

    public static abstract class Builder {
        @RecentlyNullable
        public abstract String getShortName();

        @RecentlyNonNull
        public abstract Builder setShortName(String str);

        abstract Builder zzb(List list);

        abstract AddressComponent zzc();

        @RecentlyNonNull
        public AddressComponent build() {
            AddressComponent addressComponentZzc = zzc();
            p.e(!addressComponentZzc.getName().isEmpty(), "Name must not be empty.");
            List<String> types = addressComponentZzc.getTypes();
            Iterator<String> it = types.iterator();
            while (it.hasNext()) {
                p.e(!TextUtils.isEmpty(it.next()), "Types must not contain null or empty values.");
            }
            zzb(L.s(types));
            return zzc();
        }
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str, @RecentlyNonNull List<String> list) {
        zzc zzcVar = new zzc();
        zzcVar.zza(str);
        zzcVar.zzb(list);
        return zzcVar;
    }
}
