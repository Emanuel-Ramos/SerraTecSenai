import React, { useState } from "react";
import { View, Text, Image, TouchableOpacity, StyleSheet, ImageBackground } from "react-native";
import biscoito from '../img/biscoito.png';
import biscoitoAberto from '../img/biscoitoAberto.png';
import back from '../img/backImg.png'
import poze from '../img/pozeSerio.jpeg'

const App = () => {
  const [img, setImg] = useState(biscoito)
  const [randomNumber, setRandomNumer] = useState(1)
  const [contador, setContador] = useState(0)
  const [backGround, setBackGround] = useState(poze)

  const aparecer_frase = () => {
    setImg(biscoitoAberto)
    setRandomNumer(Math.floor(Math.random() * 10))
    setContador(contador + 1)
    setBackGround(back)
  }

  const refresh = () => {
    setImg(biscoito)
    setRandomNumer('')
    setContador(0)
    setBackGround(poze)
  }

  const frases = [
    '“Humildade é lixo, mas sem render pra ninguém.”',
    '“Eu vou guardar meus cash pra multiplicar meus bens.”',
    '“Eu tô voando alto, sigo na minha luta e trabalhando dobrado.”',
    '“Essa é a lei da favela, nós sofre a covardia, mas jamais comete ela.”',
    '“As que pisava, hoje em dia tá rendendo, pode crer.”',
    '“A meta é ser campeão e trazer muita alegria pra nossa grande nação.”',
    '“Nóis escolhe quem nóis quer.”',
    '“Pois é, essa vida é muito loka ééé!”',
    '“Dia ta lindo, crima esorarado!”',
    '“Sao varios mandadao que testa nossa fe”'
  ]



  return (
    <ImageBackground source={backGround} style={styles.background}>
      <View style={styles.frase}>
        <Text style={styles.text_frase}>
          {frases[randomNumber]}
        </Text>
        <Text style={styles.text_frase}>
          {contador === 0 ? '' : `Ensinamento adquirido ${contador}X`}
        </Text>
      </View>
      <View style={styles.container}>
        <Image source={img} style={styles.biscoito} />


        <TouchableOpacity onPress={aparecer_frase} style={styles.btn}>
          <Text>
            Clique
          </Text>
        </TouchableOpacity>
        <TouchableOpacity onPress={refresh} style={styles.btn}>
          <Text>
            Voltar biscoito
          </Text>
        </TouchableOpacity>
      </View>
    </ImageBackground>
  )
};

const styles = StyleSheet.create({
  btn: {
    display: 'flex',
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#B939EC',
    borderRadius: 20,
    color: '#B939EC',
    width: 175,
    height: 50,
    margin: 7,
    padding: 10
  },
  background: {
    width: '100 %',
    height: '100 %'
  },
  biscoito: {
    width: 200,
    height: 200,
    marginBottom: 10
  },
  container: {
    height: '80%',
    marginTop: 50,
    display: "flex",
    alignItems: 'center',
    justifyContent: 'center'
  },
  frase: {
    display: "flex",
    height: '20%',
    alignItems: 'center',
    justifyContent: 'center'
  },
  text_frase: {
    margin: 10,
    marginTop: 10,
    fontWeight: 'bold',
    fontSize: 20,
    color: 'white',
    textShadowRadius: 100
  }

})

export default App;
