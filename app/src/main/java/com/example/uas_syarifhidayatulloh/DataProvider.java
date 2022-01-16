package com.example.uas_syarifhidayatulloh;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.uas_syarifhidayatulloh.model.Anjing;
import com.example.uas_syarifhidayatulloh.model.Hewan;
import com.example.uas_syarifhidayatulloh.model.Kucing;
import com.example.uas_syarifhidayatulloh.model.Ayam;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing(ctx.getString(R.string.angora_nama), ctx.getString(R.string.angora_asal),
                ctx.getString(R.string.angora_deskripsi), R.drawable.cat_angora));
        kucings.add(new Kucing(ctx.getString(R.string.bengal_nama), ctx.getString( R.string.bengal_asal),
                ctx.getString(R.string.bengal_deskripsi),R.drawable.cat_bengal));
        kucings.add(new Kucing(ctx.getString(R.string.birmani_nama), ctx.getString(R.string.birmani_asal),
                ctx.getString(R.string.birmani_deskripsi), R.drawable.cat_birman));
        kucings.add(new Kucing(ctx.getString(R.string.persia_nama), ctx.getString(R.string.persia_asal),
                ctx.getString(R.string.persia_deskripsi), R.drawable.cat_persia));
        kucings.add(new Kucing(ctx.getString(R.string.siam_nama), ctx.getString(R.string.siam_asal),
                ctx.getString(R.string.siam_deskripsi), R.drawable.cat_siam));
        kucings.add(new Kucing(ctx.getString(R.string.siberia_nama), ctx.getString(R.string.siberia_asal),
                ctx.getString(R.string.siberia_deskripsi), R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing(ctx.getString(R.string.bulldog_nama), ctx.getString(R.string.bulldog_asal),
                ctx.getString(R.string.bulldog_deskripsi), R.drawable.dog_bulldog));
        anjings.add(new Anjing(ctx.getString(R.string.husky_nama), ctx.getString(R.string.husky_asal),
                ctx.getString(R.string.husky_deskripsi), R.drawable.dog_husky));
        anjings.add(new Anjing(ctx.getString(R.string.kintamani_nama), ctx.getString(R.string.kintamani_asal),
                ctx.getString(R.string.kintamani_deskripsi), R.drawable.dog_kintamani));
        anjings.add(new Anjing(ctx.getString(R.string.samoyed_nama), ctx.getString(R.string.samoyed_asal),
                ctx.getString(R.string.samoyed_deskripsi), R.drawable.dog_samoyed));
        anjings.add(new Anjing(ctx.getString(R.string.shepherd_nama), ctx.getString(R.string.shepherd_asal),
                ctx.getString(R.string.shepherd_deskripsi), R.drawable.dog_shepherd));
        anjings.add(new Anjing(ctx.getString(R.string.shiba_nama), ctx.getString(R.string.shiba_asal),
                ctx.getString(R.string.shiba_deskripsi), R.drawable.dog_shiba));
        return anjings;
    }
    private static List<Ayam> initDataReptil(Context ctx) {
        List<Ayam> itiks = new ArrayList<>();
        itiks.add(new Ayam(ctx.getString(R.string.buaya_nama), ctx.getString(R.string.buaya_asal),
                ctx.getString(R.string.bengal_deskripsi), R.drawable.ayam_tukung));
        itiks.add(new Ayam(ctx.getString(R.string.bunglon_nama), ctx.getString(R.string.bunglon_asal),
                ctx.getString(R.string.bunglon_deskripsi), R.drawable.ayamayunai));
        itiks.add(new Ayam(ctx.getString(R.string.komodo_nama), ctx.getString(R.string.komodo_asal),
                ctx.getString(R.string.komodo_deskripsi), R.drawable.ayambalenggek));
        itiks.add(new Ayam(ctx.getString(R.string.penyu_nama), ctx.getString(R.string.penyu_asal),
                ctx.getString(R.string.penyu_deskripsi), R.drawable.ayamcemani));
        itiks.add(new Ayam(ctx.getString(R.string.tuatara_nama), ctx.getString(R.string.tuatara_asal),
                ctx.getString(R.string.tuatara_deskripsi), R.drawable.ayamciparage));
        itiks.add(new Ayam(ctx.getString(R.string.ular_nama), ctx.getString(R.string.ular_asal),
                ctx.getString(R.string.ular_deskripsi), R.drawable.ayampelung));
        return itiks;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataReptil(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}