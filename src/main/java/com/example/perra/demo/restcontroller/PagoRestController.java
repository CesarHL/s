package com.example.perra.demo.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.perra.demo.model.Pago;

@RestController("pagoRestController")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PagoRestController {

	@GetMapping("/obtenerPagos")
	public List<Pago> obtenerPagos() {
		Pago celexIngles = new Pago(1, "500 MXN ", "Pago Concepto Reinscripción Inglés", 1);
		Pago celexFrances = new Pago(2, "600 MXN ", "Pago Concepto Reinscripción Francés", 2);
		Pago celexItaliano = new Pago(3, "700 MXN ", "Pago Concepto Reinscripción Italiano", 3);

		List<Pago> listaPagos = new ArrayList<>();
		listaPagos.add(celexIngles);
		listaPagos.add(celexFrances);
		listaPagos.add(celexItaliano);
		return listaPagos;
	}

	@GetMapping("/obtenerPago/{id}")
	public Pago obtenerPago(@PathVariable("id") int idPago) {
		Pago celexIngles = new Pago(1, "500 MXN ", "Pago Concepto Reinscripción Inglés", 1);
		Pago celexFrances = new Pago(2, "600 MXN ", "Pago Concepto Reinscripción Francés", 2);
		Pago celexItaliano = new Pago(3, "700 MXN ", "Pago Concepto Reinscripción Italiano", 3);

		List<Pago> listaPagos = new ArrayList<>();
		listaPagos.add(celexIngles);
		listaPagos.add(celexFrances);
		listaPagos.add(celexItaliano);

		return listaPagos.get(idPago);
	}

	@PostMapping("/insertarPago")
	public ResponseEntity<Pago> insertarPago(@RequestBody Pago pago) {
		return ResponseEntity.ok().body(pago);
	}

	@PutMapping("/actualizarPago")
	public void actualizarPago(Pago pago) {
		ResponseEntity.ok().body("Book has been updated successfully.");
	}

	@DeleteMapping("/borrarPago/{id}")
	public void borrarPago(@PathVariable("id") int idPago) {
		ResponseEntity.ok().body("Book has been deleted successfully.");
	}

}
