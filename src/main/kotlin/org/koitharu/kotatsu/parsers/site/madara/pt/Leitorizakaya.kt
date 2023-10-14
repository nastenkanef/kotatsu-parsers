package org.koitharu.kotatsu.parsers.site.madara.pt

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.ContentType
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("LEITORIZAKAYA", "Leitor Izakaya", "pt", ContentType.HENTAI)
internal class Leitorizakaya(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.LEITORIZAKAYA, "leitorizakaya.net") {
	override val datePattern: String = "dd/MM/yyyy"
}
