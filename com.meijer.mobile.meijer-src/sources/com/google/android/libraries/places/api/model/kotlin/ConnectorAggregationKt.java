package com.google.android.libraries.places.api.model.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.ConnectorAggregation;
import com.google.android.libraries.places.api.model.EVConnectorType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"connectorAggregation", "Lcom/google/android/libraries/places/api/model/ConnectorAggregation;", "type", "Lcom/google/android/libraries/places/api/model/EVConnectorType;", "maxChargeRateKw", "", "count", "", "actions", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/ConnectorAggregation$Builder;", "", "Lkotlin/ExtensionFunctionType;", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConnectorAggregationKt {
    public static final ConnectorAggregation connectorAggregation(@RecentlyNonNull EVConnectorType type, double d10, int i10, Function1<? super ConnectorAggregation.Builder, Unit> function1) {
        Intrinsics.j(type, "type");
        ConnectorAggregation.Builder builder = ConnectorAggregation.builder(type, Double.valueOf(d10), Integer.valueOf(i10));
        if (function1 != null) {
            function1.invoke(builder);
        }
        ConnectorAggregation connectorAggregationBuild = builder.build();
        Intrinsics.i(connectorAggregationBuild, "build(...)");
        return connectorAggregationBuild;
    }

    @RecentlyNonNull
    public static /* synthetic */ ConnectorAggregation connectorAggregation$default(@RecentlyNonNull EVConnectorType eVConnectorType, double d10, int i10, @RecentlyNonNull Function1 function1, int i11, @RecentlyNonNull Object obj) {
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        return connectorAggregation(eVConnectorType, d10, i10, function1);
    }
}
