import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class Testing {

	@Test
	public void test() {

		String s = "[the=56, and=38, i=32, my=24, of=22, that=18, a=15, "
				+ "this=15, door=14, nevermore=11, chamber=11, bird=10, "
				+ "is=10, raven=10, on=10, me=9, at=8, with=8, or=8, lenore=8, "
				+ "more=8, from=8, by=7, thy=7, there=7, in=7, nothing=7, no=7, "
				+ "soul=7, above=7, then=7, still=7, said=7, he=6, bust=6, into=6, "
				+ "to=6, but=6, was=6, his=6, quoth=5, as=5, s=5, some=5, it=5, upon=5, "
				+ "so=5, name=5, what=5, word=5, before=5, tell=5, tapping=5, be=4, whom=4, "
				+ "its=4, for=4, if=4, prophet=4, all=4, thee=4, one=4, angels=4, here=4, you=3, "
				+ "whose=3, o=3, leave=3, tis=3, never=3, back=3, visiter=3, maiden=3, have=3, "
				+ "shall=3, heart=3, floor=3, perched=3, lamp=3, velvet=3, spoken=3, sitting=3, "
				+ "implore=3, sorrow=3, came=3, till=3, not=3, shore=3, fancy=3, light=3, rapping=3, "
				+ "only=3, sad=3, sat=3, sure=2, ah=2, an=2, eyes=2, god=2, rare=2, morrow=2, dreaming=2, "
				+ "er=2, take=2, little=2, burden=2, flown=2, clasp=2, just=2, ghastly=2, darkness=2, "
				+ "hath=2, unbroken=2, ever=2, plutonian=2, within=2, fowl=2, while=2, whether=2, than=2, "
				+ "entrance=2, evil=2, heard=2, entreating=2, followed=2, lining=2, stood=2, let=2, night=2, "
				+ "each=2, something=2, mystery=2, gently=2, beguiling=2, devil=2, quaff=2, stillness=2, "
				+ "though=2, many=2, thing=2, surely=2, smiling=2, we=2, now=2, napping=2, yet=2, grew=2, "
				+ "ungainly=2, lost=2, truly=2, ominous=2, out=2, nepenthe=2, explore=2, bore=2, token=2, "
				+ "grim=2, pallas=2, respite=2, sent=2, radiant=2, tempest=2, whispered=2, yore=2, spoke=1, "
				+ "fiery=1, your=1, gloated=1, these=1, startled=1, croaking=1, tinkled=1, silence=1, haunted=1, "
				+ "flirt=1, turning=1, gaunt=1, pondered=1, much=1, wind=1, flitting=1, flooronly=1, hesitating=1, "
				+ "least=1, see=1, nightly=1, thrilled=1, scarcely=1, foot=1, nodded=1, shutter=1, laden=1, "
				+ "yorethis=1, dreary=1, straight=1, fast=1, answer=1, vainly=1, borrow=1, days=1, desert=1, "
				+ "did=1, murmured=1, agreeing=1, methought=1, repeating=1, forgotten=1, reply=1, pallid=1, "
				+ "ashore=1, muttered=1, volume=1, sinking=1, deep=1, loneliness=1, lent=1, sir=1, human=1, "
				+ "over=1, midnight=1, living=1, blessed=1, home=1, form=1, fiend=1, lady=1, uttered=1, ebony=1, "
				+ "feather=1, surcease=1, hope=1, soon=1, fearing=1, relevancy=1, guessing=1, made=1, distant=1, "
				+ "being=1, distinctly=1, tempter=1, heaven=1, unhappy=1, gave=1, shadows=1, shrieked=1, engaged=1, "
				+ "other=1, air=1, thinking=1, decorum=1, streaming=1, denser=1, aidenn=1, shaven=1, december=1, "
				+ "betook=1, filled=1, wandering=1, off=1, unseen=1, placid=1, sign=1, seraphim=1, muttered:=1, "
				+ "faster=1, falls=1, peering=1, stock=1, syllable=1, throws=1, friends=1, utters=1, sainted=1, "
				+ "forget=1, dream=1, evermore=1, fluttered=1, curtain=1, dreams=1, head=1, oh=1, land=1, lordly=1, "
				+ "hear=1, reclining=1, louder=1, stepped=1, sought=1, stern=1, minute=1, master=1, burning=1, wrought=1, "
				+ "fantastic=1, caught=1, farther=1, echo=1, uncertain=1, perfumed=1, meaning=1, thereat=1, press=1, "
				+ "upstarting=1, censer=1, forgiveness=1, myself=1, mortals=1, ancient=1, balm=1, seat=1, fact=1, "
				+ "doubting=1, long=1, moment=1, remember=1, cried=1, adore=1, plainly=1, broken=1, stopped=1, art=1, "
				+ "horror=1, beating=1, weary=1, black=1, store=1, such=1, stayed=1, purple=1, quit=1, open=1, countenance=1, "
				+ "gilead=1, separate=1, presently=1, swung=1, wished=1, obeisance=1, expressing=1, lie=1, had=1, melancholy=1, "
				+ "dying=1, late=1, has=1, erthen=1, us=1, seeming=1, felt=1, lifted=1, longer=1, flutter=1, once=1, saintly=1, "
				+ "lore=1, nearly=1, lord=1, beast=1, disaster=1, doubtless=1, stronger=1, lies=1, faintly=1, unto=1, wide=1, "
				+ "again=1, suddenly=1, discourse=1, eagerly=1, shorn=1, lattice=1, window=1, shadow=1, wheeled=1, dirges=1, "
				+ "plume=1, when=1, divining=1, nameless=1, lonely=1, crest=1, ember=1, linking=1, violet=1, wretch=1, books=1, "
				+ "stately=1, marvelled=1, outpour=1, wore=1, borebut=1, our=1, weak=1, burned=1, madam=1, bleak=1, ghost=1, "
				+ "seeing=1, cushion=1, gloating=1, get=1, memories=1, dared=1, hopes=1, demon=1, merely=1, quaint=1, meant=1, "
				+ "thou=1, help=1, enchanted=1, mien=1, songs=1, cannot=1, scarce=1, tufted=1, cushioned=1, beak=1, silken=1, "
				+ "rustling=1, unmerciful=1, him=1, wondering=1, sculptured=1, desolate=1, curious=1, kind=1, opened=1, both=1, "
				+ "core=1, parting=1, flung=1, bosom=1, tossed=1, ease=1, bends=1, floating=1, grave=1, will=1, undaunted=1, "
				+ "craven=1, terrors=1, aptly=1, front=1]";
				
		
		String fix = wordCount.myWords();
		assertEquals(s, fix);
	}
}


