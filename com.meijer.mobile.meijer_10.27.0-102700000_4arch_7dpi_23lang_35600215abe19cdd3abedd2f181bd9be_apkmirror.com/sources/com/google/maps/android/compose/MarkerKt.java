package com.google.maps.android.compose;

import Kd.C3945c;
import Md.C4176b;
import Md.C4177c;
import Md.C4178d;
import Md.C4188n;
import Md.C4189o;
import Md.C4191q;
import android.view.View;
import androidx.compose.runtime.AbstractC5727k;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.google.android.gms.maps.model.LatLng;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000l\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u001a%\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0007\u001aý\u0001\u0010$\u001a\u00020\u001e2\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\n2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e0\u001b2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001bH\u0007¢\u0006\u0004\b\"\u0010#\u001a\u0093\u0002\u0010+\u001a\u00020\u001e2\u0012\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160%\"\u00020\u00162\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\n2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e0\u001b2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001e0'H\u0007¢\u0006\u0004\b)\u0010*\u001a\u0089\u0002\u0010.\u001a\u00020\u001e2\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\n2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e0\u001b2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001bH\u0007¢\u0006\u0004\b,\u0010-\u001a\u009f\u0002\u00102\u001a\u00020\u001e2\u0012\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160%\"\u00020\u00162\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\n2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e0\u001b2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001e0'H\u0007¢\u0006\u0004\b0\u00101\u001a\u0089\u0002\u00104\u001a\u00020\u001e2\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\n2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e0\u001b2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001bH\u0007¢\u0006\u0004\b3\u0010-\u001a\u00ad\u0002\u00108\u001a\u00020\u001e2\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\n2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e0\u001b2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0016\b\u0002\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001b2\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001bH\u0003¢\u0006\u0004\b6\u00107\u001a\u009f\u0002\u0010A\u001a\u00020\u001e2\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\n2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e0\u001b2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010:\u001a\u0004\u0018\u0001092\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010>\u001a\u00020=H\u0007¢\u0006\u0004\b?\u0010@\u001aÏ\u0002\u0010D\u001a\u00020\u001e2\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\n2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e0\u001b2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\u001b2\u0016\b\u0002\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001b2\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010:\u001a\u0004\u0018\u0001092\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010>\u001a\u00020=H\u0003¢\u0006\u0004\bB\u0010C¨\u0006E"}, d2 = {"", "key", "Lcom/google/android/gms/maps/model/LatLng;", "position", "Lcom/google/maps/android/compose/MarkerState;", "rememberUpdatedMarkerState", "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;Landroidx/compose/runtime/Composer;II)Lcom/google/maps/android/compose/MarkerState;", "(Lcom/google/android/gms/maps/model/LatLng;Landroidx/compose/runtime/Composer;II)Lcom/google/maps/android/compose/MarkerState;", "state", "contentDescription", "", "alpha", "LU0/f;", "anchor", "", "draggable", "flat", "LMd/c;", BarcodePickDeserializer.FIELD_ICON, "infoWindowAnchor", "rotation", "snippet", "", "tag", "title", "visible", "zIndex", "Lkotlin/Function1;", "LMd/n;", "onClick", "", "onInfoWindowClick", "onInfoWindowClose", "onInfoWindowLongClick", "Marker-qld6geY", "(Lcom/google/maps/android/compose/MarkerState;Ljava/lang/String;FJZZLMd/c;JFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Marker", "", "keys", "Lkotlin/Function0;", "content", "MarkerComposable-Khg_OnI", "([Ljava/lang/Object;Lcom/google/maps/android/compose/MarkerState;Ljava/lang/String;FJZZJFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "MarkerComposable", "MarkerInfoWindow-dVEpkwM", "(Lcom/google/maps/android/compose/MarkerState;FJZZLMd/c;JFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "MarkerInfoWindow", "infoContent", "MarkerInfoWindowComposable-LZmgDss", "([Ljava/lang/Object;Lcom/google/maps/android/compose/MarkerState;FJZZJFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "MarkerInfoWindowComposable", "MarkerInfoWindowContent-dVEpkwM", "MarkerInfoWindowContent", "infoWindow", "MarkerImpl-khPtz74", "(Lcom/google/maps/android/compose/MarkerState;Ljava/lang/String;FJZZLMd/c;JFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "MarkerImpl", "LMd/q;", "pinConfig", "Landroid/view/View;", "iconView", "", "collisionBehavior", "AdvancedMarker-3D-2zJA", "(Lcom/google/maps/android/compose/MarkerState;Ljava/lang/String;FJZZJFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LMd/c;LMd/q;Landroid/view/View;ILandroidx/compose/runtime/Composer;IIII)V", "AdvancedMarker", "AdvancedMarkerImpl-myiKm0s", "(Lcom/google/maps/android/compose/MarkerState;Ljava/lang/String;FJZZJFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;LMd/c;LMd/q;Landroid/view/View;ILandroidx/compose/runtime/Composer;IIII)V", "AdvancedMarkerImpl", "maps-compose_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MarkerKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:331:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    @com.google.maps.android.compose.GoogleMapComposable
    /* renamed from: AdvancedMarker-3D-2zJA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m47AdvancedMarker3D2zJA(com.google.maps.android.compose.MarkerState r43, java.lang.String r44, float r45, long r46, boolean r48, boolean r49, long r50, float r52, java.lang.String r53, java.lang.Object r54, java.lang.String r55, boolean r56, float r57, kotlin.jvm.functions.Function1<? super Md.C4188n, java.lang.Boolean> r58, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r59, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r60, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r61, Md.C4177c r62, Md.C4191q r63, android.view.View r64, int r65, androidx.compose.runtime.Composer r66, final int r67, final int r68, final int r69, final int r70) {
        /*
            Method dump skipped, instructions count: 1257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.MarkerKt.m47AdvancedMarker3D2zJA(com.google.maps.android.compose.MarkerState, java.lang.String, float, long, boolean, boolean, long, float, java.lang.String, java.lang.Object, java.lang.String, boolean, float, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, Md.c, Md.q, android.view.View, int, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x027e A[PHI: r44
      0x027e: PHI (r44v19 int) = (r44v0 int), (r44v3 int), (r44v4 int) binds: [B:209:0x027c, B:217:0x0292, B:216:0x028f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:466:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010f  */
    @com.google.maps.android.compose.GoogleMapComposable
    /* renamed from: AdvancedMarkerImpl-myiKm0s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m48AdvancedMarkerImplmyiKm0s(com.google.maps.android.compose.MarkerState r76, java.lang.String r77, float r78, long r79, boolean r81, boolean r82, long r83, float r85, java.lang.String r86, java.lang.Object r87, java.lang.String r88, boolean r89, float r90, kotlin.jvm.functions.Function1<? super Md.C4188n, java.lang.Boolean> r91, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r92, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r93, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r94, kotlin.jvm.functions.Function3<? super Md.C4188n, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r95, kotlin.jvm.functions.Function3<? super Md.C4188n, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r96, Md.C4177c r97, Md.C4191q r98, android.view.View r99, int r100, androidx.compose.runtime.Composer r101, final int r102, final int r103, final int r104, final int r105) {
        /*
            Method dump skipped, instructions count: 1933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.MarkerKt.m48AdvancedMarkerImplmyiKm0s(com.google.maps.android.compose.MarkerState, java.lang.String, float, long, boolean, boolean, long, float, java.lang.String, java.lang.Object, java.lang.String, boolean, float, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, Md.c, Md.q, android.view.View, int, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarkerNode AdvancedMarkerImpl_myiKm0s$lambda$101$lambda$100(MarkerState markerState, int i10, View view, C4191q c4191q, C4177c c4177c, String str, float f10, long j10, boolean z10, boolean z11, long j11, float f11, String str2, String str3, boolean z12, float f12, MapApplier mapApplier, Object obj, AbstractC5727k abstractC5727k, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function3 function3, Function3 function32) {
        C3945c map;
        C4188n c4188nC;
        C4176b c4176bG4 = new C4176b().U3(markerState.getPosition()).g4(i10);
        Intrinsics.i(c4176bG4, "collisionBehavior(...)");
        if (view != null) {
            c4176bG4.l4(view);
        } else if (c4191q != null) {
            c4176bG4.M2(C4178d.c(c4191q));
        } else if (c4177c != null) {
            c4176bG4.M2(c4177c);
        }
        c4176bG4.c0(str);
        c4176bG4.B(f10);
        c4176bG4.T(U0.f.m(j10), U0.f.n(j10));
        c4176bG4.q0(z10);
        c4176bG4.K0(z11);
        c4176bG4.O2(U0.f.m(j11), U0.f.n(j11));
        c4176bG4.U3(markerState.getPosition());
        c4176bG4.V3(f11);
        c4176bG4.W3(str2);
        c4176bG4.X3(str3);
        c4176bG4.Y3(z12);
        c4176bG4.Z3(f12);
        if (mapApplier == null || (map = mapApplier.getMap()) == null || (c4188nC = map.c(c4176bG4)) == null) {
            throw new IllegalStateException("Error adding marker");
        }
        c4188nC.q(obj);
        return new MarkerNode(abstractC5727k, c4188nC, markerState, function1, function12, function13, function14, function3, function32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$124(MarkerState markerState, String str, float f10, long j10, boolean z10, boolean z11, long j11, float f11, String str2, Object obj, String str3, boolean z12, float f12, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function3 function3, Function3 function32, C4177c c4177c, C4191q c4191q, View view, int i10, int i11, int i12, int i13, int i14, Composer composer, int i15) {
        m48AdvancedMarkerImplmyiKm0s(markerState, str, f10, j10, z10, z11, j11, f11, str2, obj, str3, z12, f12, function1, function12, function13, function14, function3, function32, c4177c, c4191q, view, i10, composer, androidx.compose.runtime.J0.a(i11 | 1), androidx.compose.runtime.J0.a(i12), androidx.compose.runtime.J0.a(i13), i14);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AdvancedMarkerImpl_myiKm0s$lambda$93$lambda$92(C4188n it) {
        Intrinsics.j(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AdvancedMarker_3D_2zJA$lambda$84$lambda$83(C4188n it) {
        Intrinsics.j(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarker_3D_2zJA$lambda$91(MarkerState markerState, String str, float f10, long j10, boolean z10, boolean z11, long j11, float f11, String str2, Object obj, String str3, boolean z12, float f12, Function1 function1, Function1 function12, Function1 function13, Function1 function14, C4177c c4177c, C4191q c4191q, View view, int i10, int i11, int i12, int i13, int i14, Composer composer, int i15) {
        m47AdvancedMarker3D2zJA(markerState, str, f10, j10, z10, z11, j11, f11, str2, obj, str3, z12, f12, function1, function12, function13, function14, c4177c, c4191q, view, i10, composer, androidx.compose.runtime.J0.a(i11 | 1), androidx.compose.runtime.J0.a(i12), androidx.compose.runtime.J0.a(i13), i14);
        return Unit.f142422a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0114  */
    @com.google.maps.android.compose.GoogleMapComposable
    /* renamed from: Marker-qld6geY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m49Markerqld6geY(com.google.maps.android.compose.MarkerState r44, java.lang.String r45, float r46, long r47, boolean r49, boolean r50, Md.C4177c r51, long r52, float r54, java.lang.String r55, java.lang.Object r56, java.lang.String r57, boolean r58, float r59, kotlin.jvm.functions.Function1<? super Md.C4188n, java.lang.Boolean> r60, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r61, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r62, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r63, androidx.compose.runtime.Composer r64, final int r65, final int r66, final int r67) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.MarkerKt.m49Markerqld6geY(com.google.maps.android.compose.MarkerState, java.lang.String, float, long, boolean, boolean, Md.c, long, float, java.lang.String, java.lang.Object, java.lang.String, boolean, float, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0286 A[EDGE_INSN: B:293:0x0286->B:201:0x0286 BREAK  A[LOOP:0: B:194:0x0271->B:200:0x0281], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013c  */
    @com.google.maps.android.compose.GoogleMapComposable
    /* renamed from: MarkerComposable-Khg_OnI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m50MarkerComposableKhg_OnI(final java.lang.Object[] r42, com.google.maps.android.compose.MarkerState r43, java.lang.String r44, float r45, long r46, boolean r48, boolean r49, long r50, float r52, java.lang.String r53, java.lang.Object r54, java.lang.String r55, boolean r56, float r57, kotlin.jvm.functions.Function1<? super Md.C4188n, java.lang.Boolean> r58, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r59, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r60, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r61, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r62, androidx.compose.runtime.Composer r63, final int r64, final int r65, final int r66) {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.MarkerKt.m50MarkerComposableKhg_OnI(java.lang.Object[], com.google.maps.android.compose.MarkerState, java.lang.String, float, long, boolean, boolean, long, float, java.lang.String, java.lang.Object, java.lang.String, boolean, float, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MarkerComposable_Khg_OnI$lambda$14$lambda$13(C4188n it) {
        Intrinsics.j(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerComposable_Khg_OnI$lambda$22(Object[] objArr, MarkerState markerState, String str, float f10, long j10, boolean z10, boolean z11, long j11, float f11, String str2, Object obj, String str3, boolean z12, float f12, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function2 function2, int i10, int i11, int i12, Composer composer, int i13) {
        m50MarkerComposableKhg_OnI(objArr, markerState, str, f10, j10, z10, z11, j11, f11, str2, obj, str3, z12, f12, function1, function12, function13, function14, function2, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0274 A[PHI: r33
      0x0274: PHI (r33v7 int) = (r33v0 int), (r33v3 int), (r33v4 int) binds: [B:208:0x0272, B:216:0x0288, B:215:0x0285] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:413:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102  */
    @com.google.maps.android.compose.GoogleMapComposable
    /* renamed from: MarkerImpl-khPtz74, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m51MarkerImplkhPtz74(com.google.maps.android.compose.MarkerState r68, java.lang.String r69, float r70, long r71, boolean r73, boolean r74, Md.C4177c r75, long r76, float r78, java.lang.String r79, java.lang.Object r80, java.lang.String r81, boolean r82, float r83, kotlin.jvm.functions.Function1<? super Md.C4188n, java.lang.Boolean> r84, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r85, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r86, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r87, kotlin.jvm.functions.Function3<? super Md.C4188n, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r88, kotlin.jvm.functions.Function3<? super Md.C4188n, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r89, androidx.compose.runtime.Composer r90, final int r91, final int r92, final int r93) {
        /*
            Method dump skipped, instructions count: 1728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.MarkerKt.m51MarkerImplkhPtz74(com.google.maps.android.compose.MarkerState, java.lang.String, float, long, boolean, boolean, Md.c, long, float, java.lang.String, java.lang.Object, java.lang.String, boolean, float, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MarkerImpl_khPtz74$lambda$52$lambda$51(C4188n it) {
        Intrinsics.j(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarkerNode MarkerImpl_khPtz74$lambda$61$lambda$60(MapApplier mapApplier, Object obj, AbstractC5727k abstractC5727k, MarkerState markerState, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function3 function3, Function3 function32, String str, float f10, long j10, boolean z10, boolean z11, C4177c c4177c, long j11, float f11, String str2, String str3, boolean z12, float f12) {
        C3945c map;
        if (mapApplier != null && (map = mapApplier.getMap()) != null) {
            C4189o c4189o = new C4189o();
            c4189o.c0(str);
            c4189o.B(f10);
            c4189o.T(U0.f.m(j10), U0.f.n(j10));
            c4189o.q0(z10);
            c4189o.K0(z11);
            c4189o.M2(c4177c);
            c4189o.O2(U0.f.m(j11), U0.f.n(j11));
            c4189o.U3(markerState.getPosition());
            c4189o.V3(f11);
            c4189o.W3(str2);
            c4189o.X3(str3);
            c4189o.Y3(z12);
            c4189o.Z3(f12);
            C4188n c4188nC = map.c(c4189o);
            if (c4188nC != null) {
                c4188nC.q(obj);
                return new MarkerNode(abstractC5727k, c4188nC, markerState, function1, function12, function13, function14, function3, function32);
            }
        }
        throw new IllegalStateException("Error adding marker");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$82(MarkerState markerState, String str, float f10, long j10, boolean z10, boolean z11, C4177c c4177c, long j11, float f11, String str2, Object obj, String str3, boolean z12, float f12, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function3 function3, Function3 function32, int i10, int i11, int i12, Composer composer, int i13) {
        m51MarkerImplkhPtz74(markerState, str, f10, j10, z10, z11, c4177c, j11, f11, str2, obj, str3, z12, f12, function1, function12, function13, function14, function3, function32, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r17v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r55v0, types: [java.lang.Object, java.lang.String] */
    @com.google.maps.android.compose.GoogleMapComposable
    /* renamed from: MarkerInfoWindow-dVEpkwM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m52MarkerInfoWindowdVEpkwM(com.google.maps.android.compose.MarkerState r43, float r44, long r45, boolean r47, boolean r48, Md.C4177c r49, long r50, float r52, java.lang.String r53, java.lang.Object r54, java.lang.String r55, boolean r56, float r57, kotlin.jvm.functions.Function1<? super Md.C4188n, java.lang.Boolean> r58, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r59, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r60, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r61, kotlin.jvm.functions.Function3<? super Md.C4188n, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r62, androidx.compose.runtime.Composer r63, final int r64, final int r65, final int r66) {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.MarkerKt.m52MarkerInfoWindowdVEpkwM(com.google.maps.android.compose.MarkerState, float, long, boolean, boolean, Md.c, long, float, java.lang.String, java.lang.Object, java.lang.String, boolean, float, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:299:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0128  */
    @com.google.maps.android.compose.GoogleMapComposable
    /* renamed from: MarkerInfoWindowComposable-LZmgDss, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m53MarkerInfoWindowComposableLZmgDss(final java.lang.Object[] r40, com.google.maps.android.compose.MarkerState r41, float r42, long r43, boolean r45, boolean r46, long r47, float r49, java.lang.String r50, java.lang.Object r51, java.lang.String r52, boolean r53, float r54, kotlin.jvm.functions.Function1<? super Md.C4188n, java.lang.Boolean> r55, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r56, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r57, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r58, kotlin.jvm.functions.Function3<? super Md.C4188n, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r59, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r60, androidx.compose.runtime.Composer r61, final int r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.MarkerKt.m53MarkerInfoWindowComposableLZmgDss(java.lang.Object[], com.google.maps.android.compose.MarkerState, float, long, boolean, boolean, long, float, java.lang.String, java.lang.Object, java.lang.String, boolean, float, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MarkerInfoWindowComposable_LZmgDss$lambda$33$lambda$32(C4188n it) {
        Intrinsics.j(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerInfoWindowComposable_LZmgDss$lambda$41(Object[] objArr, MarkerState markerState, float f10, long j10, boolean z10, boolean z11, long j11, float f11, String str, Object obj, String str2, boolean z12, float f12, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function3 function3, Function2 function2, int i10, int i11, int i12, Composer composer, int i13) {
        m53MarkerInfoWindowComposableLZmgDss(objArr, markerState, f10, j10, z10, z11, j11, f11, str, obj, str2, z12, f12, function1, function12, function13, function14, function3, function2, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r17v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r55v0, types: [java.lang.Object, java.lang.String] */
    @com.google.maps.android.compose.GoogleMapComposable
    /* renamed from: MarkerInfoWindowContent-dVEpkwM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m54MarkerInfoWindowContentdVEpkwM(com.google.maps.android.compose.MarkerState r43, float r44, long r45, boolean r47, boolean r48, Md.C4177c r49, long r50, float r52, java.lang.String r53, java.lang.Object r54, java.lang.String r55, boolean r56, float r57, kotlin.jvm.functions.Function1<? super Md.C4188n, java.lang.Boolean> r58, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r59, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r60, kotlin.jvm.functions.Function1<? super Md.C4188n, kotlin.Unit> r61, kotlin.jvm.functions.Function3<? super Md.C4188n, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r62, androidx.compose.runtime.Composer r63, final int r64, final int r65, final int r66) {
        /*
            Method dump skipped, instructions count: 1139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.MarkerKt.m54MarkerInfoWindowContentdVEpkwM(com.google.maps.android.compose.MarkerState, float, long, boolean, boolean, Md.c, long, float, java.lang.String, java.lang.Object, java.lang.String, boolean, float, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MarkerInfoWindowContent_dVEpkwM$lambda$43$lambda$42(C4188n it) {
        Intrinsics.j(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MarkerInfoWindow_dVEpkwM$lambda$24$lambda$23(C4188n it) {
        Intrinsics.j(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Marker_qld6geY$lambda$5$lambda$4(C4188n it) {
        Intrinsics.j(it, "it");
        return false;
    }

    @Deprecated
    public static final MarkerState rememberUpdatedMarkerState(String str, final LatLng latLng, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i11 & 2) != 0) {
            latLng = new LatLng(0.0d, 0.0d);
        }
        if (ComposerKt.M()) {
            ComposerKt.U(-576972567, i10, -1, "com.google.maps.android.compose.rememberUpdatedMarkerState (Marker.kt:205)");
        }
        L0.k<MarkerState, LatLng> saver = MarkerState.INSTANCE.getSaver();
        Object[] objArr = new Object[0];
        boolean z10 = (((i10 & 112) ^ 48) > 32 && composer.V(latLng)) || (i10 & 48) == 32;
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            objB = new Function0() { // from class: com.google.maps.android.compose.Q0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarkerKt.rememberUpdatedMarkerState$lambda$1$lambda$0(latLng);
                }
            };
            composer.t(objB);
        }
        MarkerState markerState = (MarkerState) L0.c.c(objArr, saver, str2, (Function0) objB, composer, (i10 << 6) & 896, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return markerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$102(MarkerNode update, Function1 it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.setOnMarkerClick(it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$103(MarkerNode update, Function1 it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.setOnInfoWindowClick(it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$104(MarkerNode update, Function1 it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.setOnInfoWindowClose(it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$105(MarkerNode update, Function1 it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.setOnInfoWindowLongClick(it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$106(MarkerNode update, Function3 function3) {
        Intrinsics.j(update, "$this$update");
        update.setInfoContent(function3);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$107(MarkerNode update, Function3 function3) {
        Intrinsics.j(update, "$this$update");
        update.setInfoWindow(function3);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$108(MarkerNode update, float f10) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().h(f10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$109(MarkerNode update, U0.f fVar) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().i(U0.f.m(fVar.getPackedValue()), U0.f.n(fVar.getPackedValue()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$110(MarkerNode update, boolean z10) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().j(z10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$111(MarkerNode update, boolean z10) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().k(z10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$112(MarkerNode update, U0.f fVar) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().m(U0.f.m(fVar.getPackedValue()), U0.f.n(fVar.getPackedValue()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$113(MarkerNode update, LatLng it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.getMarker().n(it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$114(MarkerNode update, float f10) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().o(f10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$115(MarkerNode update, String str) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().p(str);
        if (update.getMarker().f()) {
            update.getMarker().u();
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$116(MarkerNode update, Object obj) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().q(obj);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$117(MarkerNode update, String str) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().r(str);
        if (update.getMarker().f()) {
            update.getMarker().u();
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$119(C4177c c4177c, View view, C4191q c4191q, MarkerNode update, C4191q c4191q2) {
        Intrinsics.j(update, "$this$update");
        if (c4177c == null && view == null) {
            update.getMarker().l(c4191q != null ? C4178d.c(c4191q) : null);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$120(View view, MarkerNode update, C4177c c4177c) {
        Intrinsics.j(update, "$this$update");
        if (view == null) {
            update.getMarker().l(c4177c);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$121(MarkerNode update, boolean z10) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().s(z10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$123$lambda$122(MarkerNode update, float f10) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().t(f10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$95$lambda$94(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$97$lambda$96(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarkerImpl_myiKm0s$lambda$99$lambda$98(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarker_3D_2zJA$lambda$86$lambda$85(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarker_3D_2zJA$lambda$88$lambda$87(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedMarker_3D_2zJA$lambda$90$lambda$89(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerComposable_Khg_OnI$lambda$16$lambda$15(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerComposable_Khg_OnI$lambda$18$lambda$17(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerComposable_Khg_OnI$lambda$20$lambda$19(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerComposable_Khg_OnI$lambda$21(Function2 function2, Composer composer, int i10) {
        if ((i10 & 3) == 2 && composer.j()) {
            composer.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1211332052, i10, -1, "com.google.maps.android.compose.MarkerComposable.<anonymous> (Marker.kt:341)");
            }
            function2.invoke(composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$54$lambda$53(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$56$lambda$55(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$58$lambda$57(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$81$lambda$62(MarkerNode update, Function1 it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.setOnMarkerClick(it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$81$lambda$63(MarkerNode update, Function1 it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.setOnInfoWindowClick(it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$81$lambda$64(MarkerNode update, Function1 it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.setOnInfoWindowClose(it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$81$lambda$65(MarkerNode update, Function1 it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.setOnInfoWindowLongClick(it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$81$lambda$66(MarkerNode update, Function3 function3) {
        Intrinsics.j(update, "$this$update");
        update.setInfoContent(function3);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$81$lambda$67(MarkerNode update, Function3 function3) {
        Intrinsics.j(update, "$this$update");
        update.setInfoWindow(function3);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$81$lambda$68(MarkerNode update, float f10) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().h(f10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$81$lambda$69(MarkerNode update, U0.f fVar) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().i(U0.f.m(fVar.getPackedValue()), U0.f.n(fVar.getPackedValue()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$81$lambda$70(MarkerNode update, boolean z10) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().j(z10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$81$lambda$71(MarkerNode update, boolean z10) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().k(z10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$81$lambda$72(MarkerNode update, C4177c c4177c) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().l(c4177c);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$81$lambda$73(MarkerNode update, U0.f fVar) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().m(U0.f.m(fVar.getPackedValue()), U0.f.n(fVar.getPackedValue()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$81$lambda$74(MarkerNode update, LatLng it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.getMarker().n(it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$81$lambda$75(MarkerNode update, float f10) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().o(f10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$81$lambda$76(MarkerNode update, String str) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().p(str);
        if (update.getMarker().f()) {
            update.getMarker().u();
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$81$lambda$77(MarkerNode update, Object obj) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().q(obj);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$81$lambda$78(MarkerNode update, String str) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().r(str);
        if (update.getMarker().f()) {
            update.getMarker().u();
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$81$lambda$79(MarkerNode update, boolean z10) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().s(z10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerImpl_khPtz74$lambda$81$lambda$80(MarkerNode update, float f10) {
        Intrinsics.j(update, "$this$update");
        update.getMarker().t(f10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerInfoWindowComposable_LZmgDss$lambda$35$lambda$34(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerInfoWindowComposable_LZmgDss$lambda$37$lambda$36(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerInfoWindowComposable_LZmgDss$lambda$39$lambda$38(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerInfoWindowComposable_LZmgDss$lambda$40(Function2 function2, Composer composer, int i10) {
        if ((i10 & 3) == 2 && composer.j()) {
            composer.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(707101649, i10, -1, "com.google.maps.android.compose.MarkerInfoWindowComposable.<anonymous> (Marker.kt:486)");
            }
            function2.invoke(composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerInfoWindowContent_dVEpkwM$lambda$45$lambda$44(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerInfoWindowContent_dVEpkwM$lambda$47$lambda$46(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerInfoWindowContent_dVEpkwM$lambda$49$lambda$48(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerInfoWindowContent_dVEpkwM$lambda$50(MarkerState markerState, float f10, long j10, boolean z10, boolean z11, C4177c c4177c, long j11, float f11, String str, Object obj, String str2, boolean z12, float f12, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function3 function3, int i10, int i11, int i12, Composer composer, int i13) {
        m54MarkerInfoWindowContentdVEpkwM(markerState, f10, j10, z10, z11, c4177c, j11, f11, str, obj, str2, z12, f12, function1, function12, function13, function14, function3, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerInfoWindow_dVEpkwM$lambda$26$lambda$25(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerInfoWindow_dVEpkwM$lambda$28$lambda$27(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerInfoWindow_dVEpkwM$lambda$30$lambda$29(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkerInfoWindow_dVEpkwM$lambda$31(MarkerState markerState, float f10, long j10, boolean z10, boolean z11, C4177c c4177c, long j11, float f11, String str, Object obj, String str2, boolean z12, float f12, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function3 function3, int i10, int i11, int i12, Composer composer, int i13) {
        m52MarkerInfoWindowdVEpkwM(markerState, f10, j10, z10, z11, c4177c, j11, f11, str, obj, str2, z12, f12, function1, function12, function13, function14, function3, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Marker_qld6geY$lambda$11$lambda$10(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Marker_qld6geY$lambda$12(MarkerState markerState, String str, float f10, long j10, boolean z10, boolean z11, C4177c c4177c, long j11, float f11, String str2, Object obj, String str3, boolean z12, float f12, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i10, int i11, int i12, Composer composer, int i13) {
        m49Markerqld6geY(markerState, str, f10, j10, z10, z11, c4177c, j11, f11, str2, obj, str3, z12, f12, function1, function12, function13, function14, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Marker_qld6geY$lambda$7$lambda$6(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Marker_qld6geY$lambda$9$lambda$8(C4188n it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarkerState rememberUpdatedMarkerState$lambda$1$lambda$0(LatLng latLng) {
        return MarkerState.INSTANCE.invoke(latLng);
    }

    public static final MarkerState rememberUpdatedMarkerState(LatLng latLng, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            latLng = new LatLng(0.0d, 0.0d);
        }
        if (ComposerKt.M()) {
            ComposerKt.U(1974742690, i10, -1, "com.google.maps.android.compose.rememberUpdatedMarkerState (Marker.kt:218)");
        }
        Object objB = composer.B();
        if (objB == Composer.INSTANCE.a()) {
            objB = MarkerState.INSTANCE.invoke(latLng);
            composer.t(objB);
        }
        MarkerState markerState = (MarkerState) objB;
        markerState.setPosition(latLng);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return markerState;
    }
}
