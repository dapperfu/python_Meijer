package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.ConnectorAggregation;
import com.google.android.libraries.places.api.model.EVConnectorType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzr extends RecyclerView.h {
    private final List zza;
    private final int zzb;

    public zzr(List items, int i10) {
        Intrinsics.j(items, "items");
        this.zza = items;
        this.zzb = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.zza.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.F f10, int i10) throws Resources.NotFoundException {
        int i11;
        zzq viewHolder = (zzq) f10;
        Intrinsics.j(viewHolder, "viewHolder");
        ConnectorAggregation connectorAggregation = (ConnectorAggregation) this.zza.get(i10);
        Context context = viewHolder.itemView.getContext();
        TextView textViewZza = viewHolder.zza();
        EVConnectorType type = connectorAggregation.getType();
        Intrinsics.i(type, "getType(...)");
        Intrinsics.g(context);
        Intrinsics.j(type, "<this>");
        Intrinsics.j(context, "context");
        EVConnectorType eVConnectorType = EVConnectorType.EV_CONNECTOR_TYPE_UNSPECIFIED;
        switch (type) {
            case EV_CONNECTOR_TYPE_UNSPECIFIED:
            case EV_CONNECTOR_TYPE_OTHER:
                i11 = R.string.unknown_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_J1772:
                i11 = R.string.j1772_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_TYPE_2:
                i11 = R.string.type_2_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_CHADEMO:
                i11 = R.string.chademo_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_CCS_COMBO_1:
                i11 = R.string.ccs_combo_1_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_CCS_COMBO_2:
                i11 = R.string.ccs_combo_2_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_TESLA:
                i11 = R.string.tesla_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T:
                i11 = R.string.gb_t_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET:
                i11 = R.string.wall_outlet_ev_connector_type;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string = context.getString(i11);
        Intrinsics.i(string, "getString(...)");
        textViewZza.setText(string);
        viewHolder.zzb().setText(context.getString(R.string.ev_charger_max_charge_rate_kw, Integer.valueOf((int) connectorAggregation.getMaxChargeRateKw().doubleValue())));
        if (connectorAggregation.getAvailableCount() == null) {
            viewHolder.zzc().setVisibility(8);
            return;
        }
        CardView cardViewZzc = viewHolder.zzc();
        int i12 = this.zzb;
        Intrinsics.j(connectorAggregation, "<this>");
        Intrinsics.j(context, "context");
        Integer availableCount = connectorAggregation.getAvailableCount();
        boolean z10 = (availableCount == null || availableCount.intValue() == 0) ? false : true;
        int color = context.getColor(R.color.places_color_neutral_container);
        int[] PlacesMaterialThemeAttrs = R.styleable.PlacesMaterialThemeAttrs;
        Intrinsics.i(PlacesMaterialThemeAttrs, "PlacesMaterialThemeAttrs");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, PlacesMaterialThemeAttrs);
        int color2 = typedArrayObtainStyledAttributes.getColor(z10 ? R.styleable.PlacesMaterialThemeAttrs_placesColorPositiveContainer : R.styleable.PlacesMaterialThemeAttrs_placesColorNeutralContainer, color);
        typedArrayObtainStyledAttributes.recycle();
        cardViewZzc.setCardBackgroundColor(color2);
        viewHolder.zzc().setVisibility(0);
        TextView textViewZzd = viewHolder.zzd();
        Intrinsics.j(connectorAggregation, "<this>");
        Intrinsics.j(context, "context");
        Integer availableCount2 = connectorAggregation.getAvailableCount();
        boolean z11 = (availableCount2 == null || availableCount2.intValue() == 0) ? false : true;
        int color3 = context.getColor(R.color.places_color_on_neutral_container);
        int[] PlacesMaterialThemeAttrs2 = R.styleable.PlacesMaterialThemeAttrs;
        Intrinsics.i(PlacesMaterialThemeAttrs2, "PlacesMaterialThemeAttrs");
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i12, PlacesMaterialThemeAttrs2);
        int color4 = typedArrayObtainStyledAttributes2.getColor(z11 ? R.styleable.PlacesMaterialThemeAttrs_placesColorOnPositiveContainer : R.styleable.PlacesMaterialThemeAttrs_placesColorOnNeutralContainer, color3);
        typedArrayObtainStyledAttributes2.recycle();
        textViewZzd.setTextColor(color4);
        viewHolder.zzd().setText(context.getString(R.string.ev_charger_connectors_available, connectorAggregation.getAvailableCount(), connectorAggregation.getCount()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final /* bridge */ /* synthetic */ RecyclerView.F onCreateViewHolder(ViewGroup viewGroup, int i10) {
        Intrinsics.j(viewGroup, "viewGroup");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ev_charging_option_item, viewGroup, false);
        Intrinsics.g(viewInflate);
        return new zzq(viewInflate);
    }
}
