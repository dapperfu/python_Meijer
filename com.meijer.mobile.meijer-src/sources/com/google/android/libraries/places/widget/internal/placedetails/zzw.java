package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.FuelPrice;
import j$.time.Instant;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes6.dex */
public final class zzw extends RecyclerView.h {
    private final List zza;
    private final Instant zzb;

    public zzw(List items, Instant instant) {
        Intrinsics.j(items, "items");
        this.zza = items;
        this.zzb = instant;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: getItemCount */
    public final int getTotalNumberOfTabs() {
        return this.zza.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.F f10, int i10) {
        String string;
        String string2;
        zzv viewHolder = (zzv) f10;
        Intrinsics.j(viewHolder, "viewHolder");
        FuelPrice fuelPrice = (FuelPrice) this.zza.get(i10);
        Context context = viewHolder.itemView.getContext();
        TextView textViewZza = viewHolder.zza();
        FuelPrice.FuelType type = fuelPrice.getType();
        Intrinsics.i(type, "getType(...)");
        Intrinsics.g(context);
        Intrinsics.j(type, "<this>");
        Intrinsics.j(context, "context");
        FuelPrice.FuelType fuelType = FuelPrice.FuelType.FUEL_TYPE_UNSPECIFIED;
        int iOrdinal = type.ordinal();
        if (iOrdinal == 1) {
            string = context.getString(R.string.fuel_type_diesel);
            Intrinsics.i(string, "getString(...)");
        } else if (iOrdinal == 2) {
            string = context.getString(R.string.fuel_type_regular);
            Intrinsics.i(string, "getString(...)");
        } else if (iOrdinal == 3) {
            string = context.getString(R.string.fuel_type_midgrade);
            Intrinsics.i(string, "getString(...)");
        } else if (iOrdinal != 4) {
            string = "";
        } else {
            string = context.getString(R.string.fuel_type_premium);
            Intrinsics.i(string, "getString(...)");
        }
        textViewZza.setText(string);
        TextView textViewZzb = viewHolder.zzb();
        Instant instant = this.zzb;
        Intrinsics.j(fuelPrice, "<this>");
        Intrinsics.j(context, "context");
        Locale locale = Locale.getDefault();
        Intrinsics.i(locale, "getDefault(...)");
        Currency currency = Currency.getInstance(fuelPrice.getPrice().getCurrencyCode());
        Intrinsics.i(currency, "getInstance(...)");
        String symbol = currency.getSymbol(locale);
        Intrinsics.i(symbol, "getSymbol(...)");
        double dLongValue = fuelPrice.getPrice().getUnits().longValue();
        double dIntValue = fuelPrice.getPrice().getNanos().intValue();
        StringCompanionObject stringCompanionObject = StringCompanionObject.f143748a;
        String str = String.format(locale, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dLongValue + (dIntValue / 1.0E9d))}, 1));
        Intrinsics.i(str, "format(...)");
        if (zzx.zzb(fuelPrice, instant)) {
            string2 = context.getString(R.string.stale_fuel_price, symbol, str);
            Intrinsics.g(string2);
        } else {
            string2 = context.getString(R.string.fuel_price, symbol, str);
            Intrinsics.g(string2);
        }
        textViewZzb.setText(string2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final /* bridge */ /* synthetic */ RecyclerView.F onCreateViewHolder(ViewGroup viewGroup, int i10) {
        Intrinsics.j(viewGroup, "viewGroup");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fuel_option_item, viewGroup, false);
        Intrinsics.g(viewInflate);
        return new zzv(viewInflate);
    }
}
